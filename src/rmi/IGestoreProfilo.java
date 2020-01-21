package rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;

import domain.Profilo;  


public interface IGestoreProfilo extends Remote {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//ALTRO
	
	public int createProfilo(String username) throws RemoteException;
	
	public void IncrementaAnnunci(String username) throws RemoteException;
	
	public Profilo ReadProfilo(String username) throws RemoteException;

}
