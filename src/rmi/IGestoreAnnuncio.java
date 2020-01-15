package rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import domain.Annuncio;
import domain.BigliettoTreno;  


public interface IGestoreAnnuncio extends Remote {
	
	public int CreateAnnuncio(String username, String idTicket, String partenza, String arrivo, String nominativo,
			String compagnia, String classe, String fermate, String descrizione, Boolean Btreno, Boolean Baereo,
			Boolean tipAR, float prezzoA, float prezzoR, Date sDateA, Date sDateR, int nPosti) throws RemoteException;
	
	public List<Annuncio> getAllAnnunciPersonali(String username) throws RemoteException;
	
	public void DeleteBiglietto(int id) throws RemoteException;
	
	public BigliettoTreno ReadBigliettoTreno(int id) throws RemoteException;
	
	public void CreateAccordo(String username, int id, String userAcq, String feedback, int ratingV) throws RemoteException;

}
