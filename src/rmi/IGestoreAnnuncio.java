package rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;
import java.sql.Date;

import domain.BigliettoTreno;
import domain.CatalogoPersonale;  


public interface IGestoreAnnuncio extends Remote {
	
	public CatalogoPersonale getAllAnnunciPersonali(String username) throws RemoteException;
	
	public void deletion(int id, String tipoTrasporto) throws RemoteException;
	
	public boolean deletePerVendita(int id, String venditore, String acquirente, String reviewVen, int ratingVen, String tipoTrasporto) throws RemoteException;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//______________________________________ALTRO___________________________________________________________
	

	public BigliettoTreno ReadBigliettoTreno(int id) throws RemoteException;
	
	public int CreateAnnuncioTreno(String username, String idTicket, String partenza, String arrivo, String nominativo,
			String compagnia, String classe, String fermate, String descrizione, Boolean Btreno, Boolean Baereo,
			Boolean tipAR, float prezzoA, float prezzoR, Date sDateA, Date sDateR, int nPosti) throws RemoteException;
	
	
	/*
	
	
	public void DeleteBiglietto(int id) throws RemoteException;
	

	
	public void CreateAccordo(String username, int id, String userAcq, String feedback, int ratingV) throws RemoteException;

	public void UpdateRiepilogo(String username) throws RemoteException;
	
*/
}
