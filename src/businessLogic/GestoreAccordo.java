package businessLogic;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import dataBase.AccordoDAO;
import dataBase.UtenteDAO;
import domain.Accordo;
import domain.Annuncio;
import domain.Utente;
import rmi.IGestoreAccordo;
import rmi.IGestoreUtente;

public class GestoreAccordo implements IGestoreAccordo{
	
	public List<Accordo> ReadAllAccordi(String username) {

		List<Accordo> listaAccordi = null;
		AccordoDAO accordoDAO = new AccordoDAO();
		listaAccordi = accordoDAO.ReadAllAccordi(username);
		
		return listaAccordi;
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
