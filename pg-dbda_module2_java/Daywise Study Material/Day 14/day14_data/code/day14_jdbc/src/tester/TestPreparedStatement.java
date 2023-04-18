package tester;

import static utils.DBUtils.*;
import java.sql.*;
import java.util.Scanner;

public class TestPreparedStatement {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);
				// establish db cn
				Connection cn = openConnection();
				// create java.sql.PreparedStatement instance
				PreparedStatement pst = cn.prepareStatement("select * from users where id=?");

		) {
			System.out.println("Enter user id");
			// PST API public void setType(int paramIndex,Type value)
			pst.setInt(1, sc.nextInt());
			// exet query n process RST
			try(ResultSet rst=pst.executeQuery()) {
				if(rst.next())
					System.out.println("User ID "+rst.getInt(1)+" Name "+rst.getString(2)
					+" Email "+rst.getString(3)+" Password "+rst.getString(4)
					+" reg amt "+rst.getDouble(5)+ " reg on "+rst.getDate(6)+" role "+rst.getStatement());
				else //replace below code by throwing custom exc
					System.out.println("Invalid user ID : user not found!!!!!");		
			}//rst.close
		} //pst.close , cn.close
		catch (Exception e) {
			e.printStackTrace();
		} // cn.close

	}

}
