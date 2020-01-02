package learning;
import java.sql.*;

public class ConnessioneMysql {
	public static void main(String[] args) throws SQLException{
		Connection cn;
		Statement st;
		ResultSet rs;
		String sql;
		
		//_________________________connessione
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}
		
		//_________________________creo connessione (test è il nome del db)
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=");
		
		// ________________________query
		sql = "SELECT * FROM prova;";
		
		try {
			st = cn.createStatement(); // creo sempre uno statement sulla
										// connessione
			rs = st.executeQuery(sql); // faccio la query su uno statement
			while (rs.next() == true) {
				System.out.println(rs.getString("nome") + "\t" + rs.getInt("numero"));
			}
		} catch (SQLException e) {
			System.out.println("errore:" + e.getMessage());
		} // fine try-catch
		cn.close(); // chiusura connessione
	}

}
