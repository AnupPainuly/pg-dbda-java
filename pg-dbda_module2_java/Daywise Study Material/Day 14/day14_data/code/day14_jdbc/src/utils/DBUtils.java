package utils;
import java.sql.*;

public class DBUtils {
	private static Connection cn;
//add a static method to open db connection
	public static Connection openConnection() throws ClassNotFoundException,SQLException
	{
		//1. load jdbc driver : OPTIONAL 
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		//get db connection : DriverManager
		//Method of java.sql.DriverManager : 
		//public static Connection getConnection
		//(String dbURL,String userName,String password) throws SQLException
		String url = "jdbc:mysql://localhost:3306/dbda23?useSSL=false&allowPublicKeyRetrieval=true";
		cn=DriverManager.getConnection(url, "root", "root");
		System.out.println("db cn established "+cn);
		return cn;
	}
	//close connection
	public static void closeConnection() throws SQLException
	{
		if(cn != null)
			cn.close();
		System.out.println("db cn closed");
	}
}
