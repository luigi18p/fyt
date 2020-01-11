package businessLogic;

import java.sql.Date;
import java.util.List;

import dataBase.AnnuncioDAO;
import dataBase.BigliettoDAO;
import dataBase.UtenteDAO;
import domain.Annuncio;
import domain.BigliettoTreno;
import domain.Utente;

public class GestoreAnnuncio {
	
	public int CreateAnnuncio(String username, String idTicket, String partenza, String arrivo, String nominativo,
			String compagnia, String classe, String fermate, String descrizione, Boolean Btreno, Boolean Baereo,
			Boolean tipAR, float prezzoA, float prezzoR, Date sDateA, Date sDateR, int nPosti) {
		
		try {	
			if(Btreno == false && Baereo == false)
				return 1;
			String treno=null;
			if(Btreno==true) {
				treno="treno";
			}
			if(tipAR==false) {
				sDateR=null;
			}
        
			BigliettoTreno b = new BigliettoTreno(0, username, nominativo, sDateA, sDateR, treno, tipAR, prezzoA, nPosti,
					idTicket, partenza, arrivo, compagnia, classe, fermate);
			
			BigliettoDAO bigliettoDAO = new BigliettoDAO();
			b.setId(bigliettoDAO.createBigliettoTreno(b));
			
			Annuncio a= new Annuncio(username, b.getId(), descrizione, prezzoR);
			AnnuncioDAO annuncioDAO = new AnnuncioDAO();
			annuncioDAO.createAnnuncio(a);
			
			GestoreProfilo gestoreProfilo = new GestoreProfilo();
			gestoreProfilo.UpdateTotBiglietti(username);
        }catch (Exception rse) {
	            rse.printStackTrace();
	            return 1;
	        }
		return 0;
	}
		
	public List<Annuncio> getAllAnnunciPersonali(String username){
		
		List<Annuncio> listaAnnunci = null;
		AnnuncioDAO annuncioDAO = new AnnuncioDAO();
		listaAnnunci = annuncioDAO.getAllAnnunciPersonali(username);

		return listaAnnunci;
		
	}

}
