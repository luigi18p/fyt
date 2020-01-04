package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Annuncio;

public class AnnuncioDAO {
	
    private static final String CREATE_QUERY = "INSERT INTO annuncio (username,idBiglietto,descrizione,prezzoRichiesto,tipoTrasporto) VALUES (?,?,?,?,?)";
    private static final String READ_QUERY = "SELECT username,idBiglietto,descrizione,prezzoRichiesto,tipoTrasporto FROM annuncio WHERE idBiglietto = ?";
    private static final String READ_ALL_QUERY = "SELECT * FROM annuncio";
    private static final String READ_ALL_ANNUNCI_QUERY = "SELECT * FROM annuncio WHERE username = ?";
    private static final String UPDATE_QUERY = "UPDATE annuncio SET nome=?,descrizione=?,prezzoRichiesto=?,tipoTrasporto=? WHERE idBiglietto = ?";
    private static final String DELETE_QUERY = "DELETE FROM annuncio WHERE idBiglietto = ?";

    public List getAllAnnunci() {
    	
    	List<Annuncio> listaAnnunci = new ArrayList<Annuncio>();
    	Annuncio annuncio = null;
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;
    	
    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(READ_ALL_QUERY);
    		preparedStatement.execute();
    		result = preparedStatement.getResultSet();
    		while (result.next() == true) {
    			annuncio = new Annuncio(result.getString(1),result.getInt(2),result.getString(3),result.getFloat(4),result.getString(5));
    			
    			listaAnnunci.add(annuncio);
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
    	
		return listaAnnunci;
    	
    }
    
    public List getAllAnnunciPersonali(String username) {
    	
    	List<Annuncio> listaAnnunci = new ArrayList<Annuncio>();
    	Annuncio annuncio = null;
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;
    	
    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(READ_ALL_ANNUNCI_QUERY);
    		preparedStatement.setString(1, username);
    		preparedStatement.execute();
    		result = preparedStatement.getResultSet();
    		while (result.next() == true) {
    			annuncio = new Annuncio(result.getString(1),result.getInt(2),result.getString(3),result.getFloat(4),result.getString(5));
    			
    			listaAnnunci.add(annuncio);
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
    	
		return listaAnnunci;
    	
    }
    
    public int createAnnuncio(Annuncio a) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, a.getUsername());
            preparedStatement.setInt(2, a.getIdBiglietto());
            preparedStatement.setString(3, a.getDescrizione());
            preparedStatement.setFloat(4, a.getPrezzoRichiesto());
            preparedStatement.setString(5,  a.getTipoTrasporto());
            
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

    public int updateAnnuncio(Annuncio a) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(UPDATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, a.getUsername());
            preparedStatement.setInt(2, a.getIdBiglietto());
            preparedStatement.setString(3, a.getDescrizione());
            preparedStatement.setFloat(4, a.getPrezzoRichiesto());
            preparedStatement.setString(5,  a.getTipoTrasporto());
            
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
    
    public boolean deleteAnnuncio(Annuncio a) {
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

    public Annuncio readAnnuncio(int idBiglietto) {
		
		Annuncio a= null;
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
                a = new Annuncio(result.getString(1), result.getInt(2), result.getString(3), result.getFloat(4), result.getString(5));
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
