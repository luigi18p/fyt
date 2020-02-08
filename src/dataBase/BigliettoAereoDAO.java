package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BigliettoAereoDAO {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//_______________________________________ALTRO
	
    private static final String DELETE_QUERY = "DELETE FROM bigliettoAereo WHERE idAnnuncio = ?";
    
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	//______________________________________ALTRO___________________________________________________________
	
    
    /*
    
	private static final String CREATE_QUERY = "INSERT INTO biglietto (userVen,nominativo,dataAndata,dataRitorno,tipoTrasporto,tipologiaAR,prezzoAcquisto,numeroPosti,idTicket,partenza,arrivo,priority_A,diretto_A,aereopScalo_A,attesaScalo_A,bagaglioStiva_A,bagaglioAMano_A,assicurazione_A,compagnia) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String UPDATE_QUERY = "UPDATE biglietto SET userVen=?,nominativo=?,dataAndata=?,dataRitorno=?,tipoTrasporto=?,tipologiaAR=?,prezzoAcquisto=?,numeroPosti=?,idTicket=?,partenza=?,arrivo=?,priority_A=?,diretto_A=?,aereopScalo_A=?,attesaScalo_A=?,bagaglioStiva_A=?,bagaglioAMano_A=?,assicurazione_A=?,compagnia=? WHERE id = ?";

    
    
    public int createBigliettoAereo(BigliettoAereo b) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(CREATE_aereo_QUERY, Statement.RETURN_GENERATED_KEYS);
    		
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
            preparedStatement.setBoolean(12, b.isPriority());
            preparedStatement.setBoolean(13, b.isDiretto());
    		preparedStatement.setString(14, b.getAreopScalo_A());
            preparedStatement.setInt(15, b.getAttesaScalo_A());
            preparedStatement.setBoolean(16, b.isBagaglioAMano_A());
            preparedStatement.setBoolean(17, b.isBagaglioAMano_A());
            preparedStatement.setBoolean(18, b.isAssicurazione_A());
            preparedStatement.setString(19, b.getCompagnia());

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
    
    public int updateBigliettoAereo(BigliettoAereo b) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(UPDATE_aereo_QUERY, Statement.RETURN_GENERATED_KEYS);
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
            preparedStatement.setBoolean(12, b.isPriority());
            preparedStatement.setBoolean(13, b.isDiretto());
    		preparedStatement.setString(14, b.getAreopScalo_A());
            preparedStatement.setInt(15, b.getAttesaScalo_A());
            preparedStatement.setBoolean(16, b.isBagaglioAMano_A());
            preparedStatement.setBoolean(17, b.isBagaglioAMano_A());
            preparedStatement.setBoolean(18, b.isAssicurazione_A());
            preparedStatement.setString(19, b.getCompagnia());
            
            preparedStatement.setInt(20, b.getId());
            
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
}
