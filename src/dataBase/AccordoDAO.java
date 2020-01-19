package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import domain.Accordo;
import domain.ElencoAccordi;

public class AccordoDAO {

    private static final String CREATE_QUERY = "INSERT INTO accordo (userVen,idBiglietto,dataAccordo,userAcq,reviewVen,reviewAcq,ratingVen,ratingAcq) VALUES (?,?,?,?,?,?,?,?)";
//    private static final String READ_QUERY = "SELECT userVen,idBiglietto,dataAccordo,userAcq,reviewVen,reviewAcq,ratingVen,ratingAcq FROM accordo WHERE idBiglietto = ?";
    private static final String READ_reating_QUERY = "SELECT ratingAcq FROM accordo WHERE idBiglietto = ?";
    private static final String READ_allAccordi_QUERY = "SELECT userVen,idBiglietto,dataAccordo,reviewVen,ratingVen,ratingAcq FROM accordo WHERE userAcq = ?";
//    private static final String UPDATE_QUERY = "UPDATE accordo SET userVen=?,idBiglietto=?,dataAccordo=?,userAcq=?,reviewVen=?,reviewAcq=?,ratingVen=?,ratingAcq=? WHERE idBiglietto = ?";
    private static final String UPDATE_rating_QUERY = "UPDATE accordo SET reviewAcq=?, ratingAcq=? WHERE idBiglietto = ?";
    //private static final String DELETE_QUERY = "DELETE FROM accordo WHERE idBiglietto = ?";

    public int createAccordo(Accordo a) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, a.getUserVen());
            preparedStatement.setInt(2, a.getIdBiglietto());
            preparedStatement.setDate(3, a.getDataAccordo());
            preparedStatement.setString(4, a.getUserAcq());
            preparedStatement.setString(5,  a.getReviewVen());
            preparedStatement.setString(6,  a.getReviewAcq());
            preparedStatement.setInt(7,  a.getRatingVen());
            preparedStatement.setInt(8,  a.getRatingAcq());
            
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

    /*
     public int updateAccordo(Accordo a) {
     
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(UPDATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, a.getUserVen());
            preparedStatement.setInt(2, a.getIdBiglietto());
            preparedStatement.setDate(3, a.getDataAccordo());
            preparedStatement.setString(4, a.getUserAcq());
            preparedStatement.setString(5,  a.getReviewVen());
            preparedStatement.setString(6,  a.getReviewAcq());
            preparedStatement.setInt(7,  a.getRatingVen());
            preparedStatement.setInt(8,  a.getRatingAcq());
            
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
    
    public int reviewAccordo(int idBiglietto, String reviewAcq, int ratingAcq) {
    	Connection conn = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet result = null;

    	try {
    		conn = DBManager.createConnection();
    		preparedStatement = conn.prepareStatement(UPDATE_rating_QUERY, Statement.RETURN_GENERATED_KEYS);
    		preparedStatement.setString(1, reviewAcq);
    		preparedStatement.setInt(2, ratingAcq);
            preparedStatement.setInt(3, idBiglietto);
            
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
    
    /*
     public boolean deleteAccordo(Accordo a) {
     
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
*/
    
   /* public Accordo readAccordo(int idBiglietto) {
		
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
	}*/

    public ElencoAccordi ReadAllAccordi(String username) {

    	ElencoAccordi ea = new ElencoAccordi();
    	ArrayList<Accordo> listaAccordi = new ArrayList<Accordo>();
		Accordo a= null;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(READ_allAccordi_QUERY);
            preparedStatement.setString(1, username);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();
 
            while (result.next() == true) {
                a = new Accordo(result.getString(1), result.getInt(2), result.getDate(3), null, result.getString(4), null, result.getInt(5), result.getInt(6));
                listaAccordi.add(a);
            } 
            ea.setElencoAccordi(listaAccordi);
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
        return ea;
	}

    public int readRating(int idBiglietto) {
		
		int reatingAcq =0;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            conn = DBManager.createConnection();
            preparedStatement = conn.prepareStatement(READ_reating_QUERY);
            preparedStatement.setInt(1, idBiglietto);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();
 
            if (result.next() && result != null) {
                reatingAcq = result.getInt(1);
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
 
        return reatingAcq;
	}

}