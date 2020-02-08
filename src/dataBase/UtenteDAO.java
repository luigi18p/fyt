package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.Utente;

public class UtenteDAO {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
    //_______________________________altro
    

    private static final String CREATE_QUERY = "INSERT INTO utente (nome,cognome,email,password,dataNascita,cellulare,username) VALUES (?,?,?,?,?,?,?)";
    private static final String READ_login_QUERY = "SELECT username,password FROM utente WHERE username = ? AND password = ?";
    private static final String UPDATE_QUERY = "UPDATE utente SET nome=?,cognome=?,email=?,password=?,dataNascita=?,cellulare=? WHERE username = ?";
    private static final String DELETE_QUERY = "DELETE FROM utente WHERE username = ?";
    
    public int createUtente(Utente u) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, u.getNome());
            preparedStatement.setString(2, u.getCognome());
            preparedStatement.setString(3, u.getEmail());
            preparedStatement.setString(4, u.getPassword());
            preparedStatement.setDate(5,  u.getDataNascita());
            preparedStatement.setDouble(6, u.getCellulare());
            preparedStatement.setString(7, u.getUsername());
            
            preparedStatement.execute();
            result = preparedStatement.getGeneratedKeys();
            
    		
    	if (result.next() && result != null) {
            return result.getInt(1);
        } else {
            return -1;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            result.close();
        } catch (Exception rse) {
            rse.printStackTrace();
        }
        try {
            preparedStatement.close();
        } catch (Exception sse) {
            sse.printStackTrace();
        }
        try {
            conn.close();
        } catch (Exception cse) {
            cse.printStackTrace();
        }
    }
		return 0;
		
    }

    public int updateUtente(Utente u) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(UPDATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, u.getNome());
            preparedStatement.setString(2, u.getCognome());
            preparedStatement.setString(3, u.getEmail());
            preparedStatement.setString(4, u.getPassword());
            preparedStatement.setDate(5,  u.getDataNascita());
            preparedStatement.setDouble(6, u.getCellulare());
            preparedStatement.setString(7, u.getUsername());
            
            preparedStatement.execute();
            result = preparedStatement.getGeneratedKeys();
            
    		
    	if (result.next() && result != null) {
            return result.getInt(1);
        } else {
            return -1;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            result.close();
        } catch (Exception rse) {
            rse.printStackTrace();
        }
        try {
            preparedStatement.close();
        } catch (Exception sse) {
            sse.printStackTrace();
        }
        try {
            conn.close();
        } catch (Exception cse) {
            cse.printStackTrace();
        }
    }
		return 0;
    }
    
    public boolean deleteUtente(Utente u) {
		Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
        	conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(DELETE_QUERY);
            preparedStatement.setString(1, u.getUsername());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (Exception sse) {
                sse.printStackTrace();
            }
            try {
                conn.close();
            } catch (Exception cse) {
                cse.printStackTrace();
            }
        }
        return false;
	}

    public Utente readUtenteLogin(String username, String password) {
		
		Utente uVerifica= new Utente();
		
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(READ_login_QUERY);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();
 
            if (result.next() && result != null) {
                uVerifica.setUsername(result.getString(1));
                uVerifica.setPassword(result.getString(2));
            } 

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                result.close();
            } catch (Exception rse) {
                rse.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (Exception sse) {
                sse.printStackTrace();
            }
            try {
                conn.close();
            } catch (Exception cse) {
                cse.printStackTrace();
            }
        }
 
        return uVerifica;
	}
    
//  private static final String READ_ALL_QUERY = "SELECT * FROM utente";
/*   public List getAllUtenti() {
    	
    	List<Utente> listaUtenti = new ArrayList<Utente>();
    	Utente utente = null;
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;
    	
    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(READ_ALL_QUERY);
    		preparedStatement.execute();
    		result = preparedStatement.getResultSet();
    		while (result.next() == true) {
    			utente = new Utente(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getDate(5),result.getDouble(6),result.getString(7));
    			
    			listaUtenti.add(utente);
    			//System.out.println(utente.getCognome());
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
            try {
                result.close();
            } catch (Exception rse) {
                rse.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (Exception sse) {
                sse.printStackTrace();
            }
            try {
                conn.close();
            } catch (Exception cse) {
                cse.printStackTrace();
            }
        }
    	
		return listaUtenti;
    	
    }
*/
    

}
