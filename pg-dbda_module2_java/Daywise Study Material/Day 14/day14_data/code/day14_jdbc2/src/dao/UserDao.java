package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import pojos.User;

public interface UserDao {
//add a method declaration to get user details by id
	User getUserDetailsById(int userId) throws SQLException;
	//add a  method to get customers by their reg date
	List<User> getCustomersByRegDate(Date begin,Date end) throws SQLException;
	//add a  method for inserting new user details
	String insertUserDetails(User newUser) throws SQLException;
}
