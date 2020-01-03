package dataBase;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UtenteDAO {

    private static final String CREATE_QUERY = "INSERT INTO utente (nome,cognome,email,password,dataNascita,cellulare,username) VALUES (?,?,?,?,?,?,?)";
    private static final String READ_QUERY = "SELECT nome,cognome,email,password,dataNascita,cellulare,username FROM utente WHERE username = ?";
    private static final String READ_ALL_QUERY = "SELECT * FROM utente";
    private static final String UPDATE_QUERY = "UPDATE utente SET nome=?,cognome=?,email=?,password=?,dataNascita=?,cellulare=? WHERE username = ?";
    private static final String DELETE_QUERY = "DELETE FROM utente WHERE id = username";
    
    public List getAllUtenti() {
    	
    	List<Utente> listaUtenti = new ArrayList<Utente>();
    	Utente utente = null;
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;
    	
    	try {
    		conn = ConnessioneDB.createConnection();
    		preparedStatement = conn.prepareStatement(READ_ALL_QUERY);
    		preparedStatement.execute();
    		result = preparedStatement.getResultSet();
    		while (result.next() == true) {
    			utente = new Utente(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getDate(5),result.getInt(6),result.getString(7));
    			listaUtenti.add(utente);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		try {
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    	
		return listaUtenti;
    	
    }

}
