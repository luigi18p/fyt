package businessLogic;

import dataBase.AccordoDAO;
import domain.ElencoAccordi;
import rmi.IGestoreAccordo;

public class GestoreAccordo implements IGestoreAccordo{
	
	private volatile static GestoreAccordo single = null;
	public GestoreAccordo() {}
	
	public static synchronized GestoreAccordo getIstance() {
		
		if(single == null) {
			synchronized(GestoreAccordo.class) {
				if(single == null) {
					single = new GestoreAccordo();
				}
			}
		}
		return single;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//_______________________________________ALTRO
	
	public ElencoAccordi ReadAllAccordi(String username) {

		ElencoAccordi ea = new ElencoAccordi();
		AccordoDAO accordoDAO = new AccordoDAO();
		ea.setElencoAccordi(accordoDAO.ReadAllAccordi(username));
		
		return ea;
	}
	
	public boolean updateRatingAccordo(int idAccordo, String reviewAcq, int ratingAcq){
		
		AccordoDAO accordoDAO = new AccordoDAO();
		if(accordoDAO.readRating(idAccordo) == 0) {
			accordoDAO.reviewAccordo(idAccordo, reviewAcq, ratingAcq);
			
			return true;
		}else {
			return false;
		}
		
	}
	
}
