package businessLogic;

import dataBase.AccordoDAO;
import domain.ElencoAccordi;
import rmi.IGestoreAccordo;

public class GestoreAccordo implements IGestoreAccordo{
	
	public ElencoAccordi ReadAllAccordi(String username) {

		ElencoAccordi ea = new ElencoAccordi();
		AccordoDAO accordoDAO = new AccordoDAO();
		ea = accordoDAO.ReadAllAccordi(username);
		
		return ea;
	}
	
	public boolean updateRatingAccordo(int idBiglietto, String reviewAcq, int ratingAcq){
		
		AccordoDAO accordoDAO = new AccordoDAO();
		if(accordoDAO.readRating(idBiglietto) == 0) {
			accordoDAO.reviewAccordo(idBiglietto, reviewAcq, ratingAcq);
			
			return true;
		}else {
			return false;
		}
		
	}
}
