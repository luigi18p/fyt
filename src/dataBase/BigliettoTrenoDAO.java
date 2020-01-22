package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.BigliettoTreno;

public class BigliettoTrenoDAO {

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	
	//_______________________________________ALTRO
    
    private static final String READ_QUERY = "SELECT * FROM bigliettoTreno WHERE idAnnuncio = ?";
    private static final String CREATE_QUERY = "INSERT INTO bigliettoTreno (idAnnuncio,nominativo,dataAndata,dataRitorno,tipologiaAR,prezzoAcquisto,numeroPosti,idTicket,partenza,arrivo,compagnia,classe,fermate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";


    public BigliettoTreno readBigliettoTreno(int idAnnuncio) {
		
    	BigliettoTreno b= null;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(READ_QUERY);
            preparedStatement.setInt(1, idAnnuncio);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();
 
            if (result.next() && result != null) {
                b = new BigliettoTreno(result.getInt(1), result.getString(2), result.getDate(3), result.getDate(4), 
                		result.getBoolean(5), result.getFloat(6), result.getInt(7),
                		result.getString(8), result.getString(9), result.getString(10), result.getString(11), 
                		result.getString(12), result.getString(13));    
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
 
        return b;
	}
    
    public void createBigliettoTreno(BigliettoTreno b) {
    	
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
    		
    		preparedStatement.setInt(1, b.getId());
            preparedStatement.setString(2, b.getNominativo());
            preparedStatement.setDate(3, b.getDataAndata());
            preparedStatement.setDate(4, b.getDataRitorno());
            preparedStatement.setBoolean(5, b.getTipologiaAR());
            preparedStatement.setFloat(6, b.getPrezzoAcquisto());
            preparedStatement.setInt(7, b.getNumeroDiPosti());
            preparedStatement.setString(8, b.getIdTicket());
            preparedStatement.setString(9, b.getPartenza());
            preparedStatement.setString(10, b.getArrivo());
            preparedStatement.setString(11, b.getCompagnia());
            preparedStatement.setString(12, b.getClasse());
            preparedStatement.setString(13, b.getFermate());

            preparedStatement.execute();
            

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

    }
    
//  //  //  private static final String UPDATE_QUERY = "UPDATE bigliettoTreno SET userVen=?,nominativo=?,dataAndata=?,dataRitorno=?,tipoTrasporto=?,tipologiaAR=?,prezzoAcquisto=?,numeroPosti=?,idTicket=?,partenza=?,arrivo=?,compagnia=?,classe_T=?,fermate_T=? WHERE id = ?";

    
    
    /*
    

    

    public int updateBiglietto(BigliettoTreno b) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(UPDATE_QUERY, Statement.RETURN_GENERATED_KEYS);
    		preparedStatement.setString(1, b.getUserVen());
            preparedStatement.setString(2, b.getNominativo());
            preparedStatement.setDate(3, b.getDataAndata());
            preparedStatement.setDate(4, b.getDataRitorno());
            preparedStatement.setString(5, b.getTipoTrasporto());
            preparedStatement.setBoolean(6, b.getTipologiaAR());
            preparedStatement.setFloat(7, b.getPrezzoAcquisto());
            preparedStatement.setInt(8, b.getNumeroDiPosti());
            preparedStatement.setString(9, b.getIdTicket());
            preparedStatement.setString(10, b.getPartenza());
            preparedStatement.setString(11, b.getArrivo());
            preparedStatement.setString(12, b.getCompagnia());
            preparedStatement.setString(13, b.getClasse_T());
            preparedStatement.setString(14, b.getFermate_T());
            
            preparedStatement.setInt(15, b.getId());
            
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

   
*/
    
	/*
	private static final String DELETE_QUERY = "DELETE FROM bigliettoTreno WHERE idAnnuncio = ?";
    
    public void deleteBiglietto(int id) {
		Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
        	conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(DELETE_QUERY);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
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
	}
    
    
    
    
    
    
    
    
    
    */
    
    
}
