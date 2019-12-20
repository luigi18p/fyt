//import necessari per RMI
 
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject;

// Usa i metodi realizzati da "InterfaceImplementation"


public class Server extends InterfaceImplementation {
	
	public Server() {} 
	
	public static void main(String[] args) {
 
		try { 
	         // Instantiating the implementation class 
			InterfaceImplementation IstanzaImplementazioneInterfaccia = new InterfaceImplementation(); 
			
			// Esporta l'istanza della classe implementativa verso lo stub
			 RemoteInterface stub = (RemoteInterface) UnicastRemoteObject.exportObject(IstanzaImplementazioneInterfaccia, 0);  
	         
	         // Binding dello stub nel registry
	         Registry registry = LocateRegistry.createRegistry(5000); 
	         
	         registry.bind("RemoteInterface", stub);  
	         System.err.println("Server ready"); 
	      } catch (Exception e) { 
	         System.err.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); 
	      
	    }

	}

}
