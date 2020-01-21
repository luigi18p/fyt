package rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;
import domain.ElencoAccordi;  


public interface IGestoreAccordo extends Remote {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//______________________________ALTRO

	public ElencoAccordi ReadAllAccordi(String username) throws RemoteException;

	
	public boolean updateRatingAccordo(int idAnnuncio, String reviewAcq, int ratingAcq) throws RemoteException;

	

}
