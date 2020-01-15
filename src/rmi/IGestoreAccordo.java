package rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;
import java.util.List;

import domain.Accordo;  


public interface IGestoreAccordo extends Remote {
	
	public boolean updateRatingAccordo(int idBiglietto, String reviewAcq, int ratingAcq) throws RemoteException;
	
	public List<Accordo> ReadAllAccordi(String username) throws RemoteException;

}
