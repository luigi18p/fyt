package rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;
import java.sql.Date;  

public interface IGestoreUtente extends Remote {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//_____________________________ALTRO

	public int Registrazione(String nome, String cognome, String email, String password, 
			Date dataNascita, double cellulare, String username) throws RemoteException;
	
	public int Login(String username, String password) throws RemoteException;
	
	public int updateUtente(String nome, String cognome, String email, String password, 
			Date dataNascita, double cellulare, String username) throws RemoteException;
}
