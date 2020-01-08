package businessLogic;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import dataBase.AccordoDAO;
import dataBase.UtenteDAO;
import domain.Accordo;
import domain.Annuncio;
import domain.Utente;

public class GestoreAccordo {
	
	public void CreateAccordo(String username, int id, String userAcq, String feedback, Object object, int ratingV, int i) {
		

			Utente u = new Utente();
			UtenteDAO utenteDAO = new UtenteDAO();
			u=utenteDAO.readUtente(userAcq);
			if(u.getUsername() != null) {
							
				java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
				Accordo a = new Accordo(username, id, date, userAcq, feedback, null, ratingV, i);
				
				AccordoDAO accordoDAO = new AccordoDAO();
				accordoDAO.createAccordo(a);
				
				GestoreBiglietto gestoreBiglietto = new GestoreBiglietto();
				gestoreBiglietto.DeleteBiglietto(id);
				
				GestoreProfilo gestoreProfilo = new GestoreProfilo();
				gestoreProfilo.UpdateTotBiglietti_1(username);
			}


	}

	public List ReadAllAccordi(String username) {

		List<Accordo> listaAccordi = null;
		AccordoDAO accordoDAO = new AccordoDAO();
		listaAccordi = accordoDAO.ReadAllAccordi(username);
		
		return listaAccordi;
	}
	
	public boolean updateRatingAccordo(int idBiglietto, String reviewAcq, int ratingAcq){
		
		AccordoDAO accordoDAO = new AccordoDAO();
		int i =accordoDAO.readReating(idBiglietto);
		if(accordoDAO.readReating(idBiglietto) == 0) {
			accordoDAO.updateRatingAccordo(idBiglietto, reviewAcq, ratingAcq);
			
			return true;
		}else {
			return false;
		}
		
	}
}
