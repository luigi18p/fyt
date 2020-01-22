package businessLogic;

import java.rmi.RemoteException;
import java.sql.Date;

import dataBase.BigliettoTrenoDAO;
import dataBase.AnnuncioDAO;
import domain.Annuncio;
import domain.BigliettoTreno;
import domain.CatalogoPersonale;
import domain.ElencoAccordi;
import domain.Profilo;
import rmi.IGestoreAnnuncio;

public class GestoreAnnuncio implements IGestoreAnnuncio{
	
	private volatile static GestoreAnnuncio single = null;
	public GestoreAnnuncio() {}
	
	public static synchronized GestoreAnnuncio getIstance() {
		
		if(single == null) {
			synchronized(GestoreAnnuncio.class) {
				if(single == null) {
					single = new GestoreAnnuncio();
				}
			}
		}
		return single;
	}

	public CatalogoPersonale getAllAnnunciPersonali(String username) throws RemoteException{
		
		CatalogoPersonale cp = new CatalogoPersonale();
		cp.getAllAnnunciPersonali(username);

		return cp;
	}
	
	public boolean deletePerVendita(int id, String venditore, String acquirente, String reviewVen, int ratingVen)throws RemoteException {
		
		Profilo p = new Profilo();
		boolean esistenzaUsername = p.checkProfilo(acquirente);
		if (esistenzaUsername == false) {
			return false;
		}
		else {
			ElencoAccordi elencoA = new ElencoAccordi();
			elencoA.createAccordo(id, venditore, acquirente, reviewVen, ratingVen);
			
			deletion(id);
			p.updateRiepilogo(venditore);
			return true;
		}	
	}
	
	public void deletion(int id) throws RemoteException{

		Annuncio.deleteAnnuncio(id);

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	//______________________________________ALTRO___________________________________________________________

	public BigliettoTreno ReadBigliettoTreno(int id) {
		
		BigliettoTrenoDAO bigliettoDAO = new BigliettoTrenoDAO();
		BigliettoTreno b = bigliettoDAO.readBigliettoTreno(id);

		return b;
		
	}
	
	public int CreateAnnuncioTreno(String username, String idTicket, String partenza, String arrivo, String nominativo,
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
        
			Annuncio a= new Annuncio(0,username, descrizione, prezzoR,treno);
			AnnuncioDAO annuncioDAO = new AnnuncioDAO();
			a.setIdAnnuncio(annuncioDAO.createAnnuncio(a));
			
			BigliettoTreno b = new BigliettoTreno(a.getIdAnnuncio(), nominativo, sDateA, sDateR, tipAR, prezzoA, nPosti,
					idTicket, partenza, arrivo, compagnia, classe, fermate);
				
			BigliettoTrenoDAO bigliettoDAO = new BigliettoTrenoDAO();
			bigliettoDAO.createBigliettoTreno(b);
			
			GestoreProfilo gestoreProfilo = new GestoreProfilo();
			gestoreProfilo.IncrementaAnnunci(username);
        }catch (Exception rse) {
	            rse.printStackTrace();
	            return 1;
	        }
		return 0;
	}
	}
