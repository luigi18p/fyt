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

/*
 
Connection conn;
PreparedStatement preparedStatement;
ResultSet result;
String querysql;

querysql = "SELECT nome FROM utente;";

try {
	preparedStatement = conn.prepareStatement(querysql); // creo sempre uno statement sulla
								// connessione
	preparedStatement.execute();
	result = preparedStatement.getResultSet(); // faccio la query su uno statement
	while (result.next() == true) {
		System.out.println(result.getString("nome"));
	}
} catch (SQLException e) {
	System.out.println("errore:" + e.getMessage());
} // fine try-catch
conn.close(); // chiusura connessione
*/