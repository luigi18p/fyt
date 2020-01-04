package dataBase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.Accordo;

public class AccordoDAO {
	
    private static final String CREATE_QUERY = "INSERT INTO accordo (usernameVenditore,idBiglietto,dataAccordo,usernameAcquirente,descrizioneV,descrizioneA,stelleV,stelleA) VALUES (?,?,?,?,?,?,?,?)";
    private static final String READ_QUERY = "SELECT usernameVenditore,idBiglietto,dataAccordo,usernameAcquirente,descrizioneV,descrizioneA,stelleV,stelleA FROM accordo WHERE idBiglietto = ?";
    private static final String UPDATE_QUERY = "UPDATE accordo SET usernameVenditore=?,idBiglietto=?,dataAccordo=?,usernameAcquirente=?,descrizioneV=?,descrizioneA=?,stelleV=?,stelleA=? WHERE idBiglietto = ?";
    private static final String DELETE_QUERY = "DELETE FROM accordo WHERE idBiglietto = ?";

    public int createAccordo(Accordo a) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, a.getUsernameVenditore());
            preparedStatement.setInt(2, a.getIdBiglietto());
            preparedStatement.setDate(3, a.getDataAccordo());
            preparedStatement.setString(4, a.getUsernameAcquirente());
            preparedStatement.setString(5,  a.getDescrizioneV());
            preparedStatement.setString(6,  a.getDescrizioneA());
            preparedStatement.setInt(7,  a.getStelleV());
            preparedStatement.setInt(8,  a.getStelleA());
            
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

    public int updateAccordo(Accordo a) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(UPDATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, a.getUsernameVenditore());
            preparedStatement.setInt(2, a.getIdBiglietto());
            preparedStatement.setDate(3, a.getDataAccordo());
            preparedStatement.setString(4, a.getUsernameAcquirente());
            preparedStatement.setString(5,  a.getDescrizioneV());
            preparedStatement.setString(6,  a.getDescrizioneA());
            preparedStatement.setInt(7,  a.getStelleV());
            preparedStatement.setInt(8,  a.getStelleA());
            
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
    
    public boolean deleteAnccordo(Accordo a) {
		Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
        	conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(DELETE_QUERY);
            preparedStatement.setInt(1, a.getIdBiglietto());
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

    public Accordo readAccordo(int idBiglietto) {
		
		Accordo a= null;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(READ_QUERY);
            preparedStatement.setInt(1, idBiglietto);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();
 
            if (result.next() && result != null) {
                a = new Accordo(result.getString(1), result.getInt(2), result.getDate(3), result.getString(4), result.getString(5), result.getString(6), result.getInt(7), result.getInt(8));
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
 
        return a;
	}

}