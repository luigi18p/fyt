package dataBase;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

import domain.Profilo;
import domain.Utente;

public class ProfiloDAO {
	
	private static final String CREATE_QUERY = "INSERT INTO profilo (username,totaleBigliettiInVendita,mediaFeedback,nVisite) VALUES (?,?,?,?)";
    private static final String READ_QUERY = "SELECT username,totaleBigliettiInVendita,mediaFeedback,nVisite FROM profilo WHERE username = ?";
    private static final String UPDATE_QUERY = "UPDATE profilo SET totaleBigliettiInVendita=?,mediaFeedback=?,nVisite=? WHERE username = ?";
    private static final String DELETE_QUERY = "DELETE FROM profilo WHERE username = ?";

    public int createProfilo(Profilo p) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, p.getUsername());
            preparedStatement.setInt(2, p.getTotaleBigliettiInVendita());
            preparedStatement.setInt(3, p.getMediaFeedback());
            preparedStatement.setInt(4, p.getnVisite());
            
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
    
    public int updateProfilo(Profilo p) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(UPDATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, p.getTotaleBigliettiInVendita());
            preparedStatement.setInt(2, p.getMediaFeedback());
            preparedStatement.setInt(3, p.getnVisite());
            preparedStatement.setString(4, p.getUsername());
            
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
    
    //eliminare delete profilo
    public boolean deleteProfilo(Profilo p) {
    	Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
        	conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(DELETE_QUERY);
            preparedStatement.setString(1, p.getUsername());
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
    
    public Profilo readProfilo(String username) {
    	Profilo p= null;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(READ_QUERY);
            preparedStatement.setString(1, username);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();
 
            if (result.next() && result != null) {
                p = new Profilo(username,result.getInt(2), result.getInt(3), result.getInt(4));
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
 
        return p;
    	
    }
}

