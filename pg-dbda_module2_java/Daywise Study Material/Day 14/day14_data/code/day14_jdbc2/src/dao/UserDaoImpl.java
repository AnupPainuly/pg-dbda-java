package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static utils.DBUtils.*;

import pojos.User;

public class UserDaoImpl implements UserDao {
	// state
	private Connection conn;
	private PreparedStatement pst1,pst2,pst3;

	public UserDaoImpl() throws SQLException {

		// open db conn
		conn = openConnection();
		// create PST
		pst1 = conn.prepareStatement("select * from users where id=?");
		pst2=conn.prepareStatement("select * from users where reg_date between ? and ? and role='CUSTOMER'");
		pst3=conn.prepareStatement("insert into users values(default,?,?,?,?,?,?)");
		System.out.println("user dao created!");
	}

	@Override
	public User getUserDetailsById(int userId) throws SQLException {
		// 1. set IN param : user id
		pst1.setInt(1, userId);
		// 2. exec query(select ) --> RST --> process the RST
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next())
				// int userId, String name, String email, String password, double regAmount,
				// Date regDate, String role
				return new User(userId, rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5),
						rst.getDate(6), rst.getString(7));
		}
		return null;// this can be replace by throwing custo exc
	}	

	@Override
	public List<User> getCustomersByRegDate(Date begin, Date end) throws SQLException {
		//create empty AL
		List<User> users=new ArrayList<>();
		//1 . set IN params
		pst2.setDate(1, begin);
		pst2.setDate(2, end);
		//exec query --> get rst --> List<User>
		try(ResultSet rst=pst2.executeQuery())
		{
			while(rst.next())
				users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5),
						rst.getDate(6), rst.getString(7)));
		}
		return users;
	}
	

	@Override
	public String insertUserDetails(User newUser) throws SQLException {
		// set IN params
		//name    | email          | password | reg_amt | reg_date   | role
		pst3.setString(1, newUser.getName());//set name
		pst3.setString(2,newUser.getEmail());//set em
		pst3.setString(3,newUser.getPassword());//set pass
		pst3.setDouble(4,newUser.getRegAmount());//set amt
		pst3.setDate(5, newUser.getRegDate());//set reg date
		pst3.setString(6,newUser.getRole());//set role
		//exec update : DML --insert
		int rowCount=pst3.executeUpdate();
		return "User registered , row count "+rowCount;
	}

	// clean up dao layer
	public void cleanUp() throws SQLException {
		// close PST
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		// close cn
		closeConnection();
		System.out.println("user dao  cleaned up!");
	}

}
