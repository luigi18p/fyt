package rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;

import domain.Profilo;  


public interface IGestoreProfilo extends Remote {
	
	public int createProfilo(String username) throws RemoteException;
	
	public void UpdateRiepilogo(String username, int i) throws RemoteException;
	
	public Profilo ReadProfilo(String username) throws RemoteException;

}
