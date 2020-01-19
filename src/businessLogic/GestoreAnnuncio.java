package businessLogic;

import java.sql.Date;
import java.util.Calendar;

import dataBase.AccordoDAO;
import dataBase.AnnuncioDAO;
import dataBase.BigliettoDAO;
import dataBase.ProfiloDAO;
import domain.Accordo;
import domain.Annuncio;
import domain.BigliettoTreno;
import domain.CatalogoPersonale;
import domain.Profilo;
import rmi.IGestoreAnnuncio;

public class GestoreAnnuncio implements IGestoreAnnuncio{
	
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
			gestoreProfilo.IncrementaAnnunci(username);
        }catch (Exception rse) {
	            rse.printStackTrace();
	            return 1;
	        }
		return 0;
	}
		
	public CatalogoPersonale getAllAnnunciPersonali(String username){
		
		CatalogoPersonale cp = new CatalogoPersonale();
		AnnuncioDAO annuncioDAO = new AnnuncioDAO();
		cp = annuncioDAO.getAllAnnunciPersonali(username);

		return cp;
		
	}
	
	public void DeleteBiglietto(int id) {
		
		BigliettoDAO bigliettoDAO = new BigliettoDAO();
		bigliettoDAO.deleteBiglietto(id);
		
	}
	
	public BigliettoTreno ReadBigliettoTreno(int id) {
		
		BigliettoDAO bigliettoDAO = new BigliettoDAO();
		BigliettoTreno b = bigliettoDAO.readBigliettoTreno(id);

		return b;
		
	}

	public void CreateAccordo(String username, int id, String userAcq, String feedback, int ratingV) {
		
		Profilo p = new Profilo();
		ProfiloDAO profiloDAO = new ProfiloDAO();
		p.setUsername(profiloDAO.readUsername(userAcq));
		if(p.getUsername() != null) {
						
			java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			Accordo a = new Accordo(username, id, date, userAcq, feedback, null, ratingV, 0);
			
			AccordoDAO accordoDAO = new AccordoDAO();
			accordoDAO.createAccordo(a);
			
			DeleteBiglietto(id);
			
			GestoreAnnuncio gestoreAnnuncio = new GestoreAnnuncio();
			gestoreAnnuncio.UpdateRiepilogo(username);
		}
	}

	public void UpdateRiepilogo(String username) {
		try {
			Profilo p = new Profilo(username);
			ProfiloDAO profiloDAO = new ProfiloDAO();
			p=profiloDAO.readProfilo(username);
			p.setTotaleBigliettiInVendita((p.getTotaleBigliettiInVendita())-1);
			profiloDAO.updateProfilo(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
