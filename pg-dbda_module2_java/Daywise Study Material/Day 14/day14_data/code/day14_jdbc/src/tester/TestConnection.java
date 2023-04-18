package tester;
import static utils.DBUtils.*;
import java.sql.*;

public class TestConnection {

	public static void main(String[] args) {
		try(Connection cn=openConnection())
		{
			System.out.println("success!");
		} catch (Exception e) {
			e.printStackTrace();
		}//cn.close

	}

}
