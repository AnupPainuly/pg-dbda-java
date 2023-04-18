package tester;

import static utils.DBUtils.*;
import java.sql.*;

public class TestStatement {

	public static void main(String[] args) {
		try(//1. establish db cn
				Connection cn=openConnection();
				//2. create a Statement object to hold query
				Statement st=cn.createStatement();
				//3. pass the sql n exec it
				ResultSet rst=st.executeQuery("select * from users");
				)
		{
			//processing of the RST
			while(rst.next())
				System.out.println("User ID "+rst.getInt(1)+" Name "+rst.getString(2)
				+" Email "+rst.getString(3)+" Password "+rst.getString(4)
				+" reg amt "+rst.getDouble(5)+ " reg on "+rst.getDate(6)+" role "+rst.getStatement());
		} //rst.close , st.close , cn.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
