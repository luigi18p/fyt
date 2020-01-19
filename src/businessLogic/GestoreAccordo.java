package businessLogic;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import dataBase.AccordoDAO;
import dataBase.UtenteDAO;
import domain.Accordo;
import domain.Annuncio;
import domain.ElencoAccordi;
import domain.Utente;
import rmi.IGestoreAccordo;
import rmi.IGestoreUtente;

public class GestoreAccordo implements IGestoreAccordo{
	
	public ElencoAccordi ReadAllAccordi(String username) {

		ElencoAccordi ea = new ElencoAccordi();
		List<Accordo> listaAccordi = null;
		AccordoDAO accordoDAO = new AccordoDAO();
		ea = accordoDAO.ReadAllAccordi(username);
		
		return ea;
	}
	
	public boolean updateRatingAccordo(int idBiglietto, String reviewAcq, int ratingAcq){
		
		AccordoDAO accordoDAO = new AccordoDAO();
		int i =accordoDAO.readRating(idBiglietto);
		if(accordoDAO.readRating(idBiglietto) == 0) {
			accordoDAO.reviewAccordo(idBiglietto, reviewAcq, ratingAcq);
			
			return true;
		}else {
			return false;
		}
		
	}
}
