package dataBase;
import java.sql.*;


public class DBManager extends ConnectionFactory{
		
		public static Connection createConnection() {
			Connection conn=null;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fyt?user=root&password=");
			}catch(ClassNotFoundException e) {
				System.out.println("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
}