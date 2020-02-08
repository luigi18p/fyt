package rmi;
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject;

import businessLogic.GestoreAccordo;
import businessLogic.GestoreAnnuncio;
import businessLogic.GestoreProfilo;
import businessLogic.GestoreUtente;

public class ServerProxyManager extends UnicastRemoteObject{
	
	private static final long serialVersionUID = 1L;
	
	public ServerProxyManager() throws RemoteException {
		super();
	}

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.createRegistry(5008); 
			
			GestoreUtente gestoreUtente = new GestoreUtente();
			IGestoreUtente sketetonGUtente = (IGestoreUtente) UnicastRemoteObject.exportObject(gestoreUtente,0);
			registry.rebind("IGestoreUtente", sketetonGUtente);
			
			GestoreProfilo gestoreProfilo = new GestoreProfilo();
			IGestoreProfilo sketetonGProfilo = (IGestoreProfilo) UnicastRemoteObject.exportObject(gestoreProfilo,0);
			registry.rebind("IGestoreProfilo", sketetonGProfilo);
			
			GestoreAnnuncio gestoreAnnuncio = new GestoreAnnuncio();
			IGestoreAnnuncio sketetonGAnnuncio = (IGestoreAnnuncio) UnicastRemoteObject.exportObject(gestoreAnnuncio,0);
			registry.rebind("IGestoreAnnuncio", sketetonGAnnuncio);
			
			GestoreAccordo gestoreAccordo = new GestoreAccordo();
			IGestoreAccordo sketetonGAccordo = (IGestoreAccordo) UnicastRemoteObject.exportObject(gestoreAccordo,0);
			registry.rebind("IGestoreAccordo", sketetonGAccordo);
			
		}catch (RemoteException e){
			e.printStackTrace();
			System.out.println("Proxy error");
		}
	}

}
