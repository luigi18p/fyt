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

	}

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.createRegistry(5008); 
			
			GestoreUtente gestoreUtente = new GestoreUtente();
			IGestoreUtente igestoreUtente = (IGestoreUtente) UnicastRemoteObject.exportObject(gestoreUtente,0);
			registry.rebind("IGestoreUtente", igestoreUtente);
			
			GestoreProfilo gestoreProfilo = new GestoreProfilo();
			IGestoreProfilo igestoreProfilo = (IGestoreProfilo) UnicastRemoteObject.exportObject(gestoreProfilo,0);
			registry.rebind("IGestoreProfilo", igestoreProfilo);
			
			GestoreAnnuncio gestoreAnnuncio = new GestoreAnnuncio();
			IGestoreAnnuncio igestoreAnnuncio = (IGestoreAnnuncio) UnicastRemoteObject.exportObject(gestoreAnnuncio,0);
			registry.rebind("IGestoreAnnuncio", igestoreAnnuncio);
			
			GestoreAccordo gestoreAccordo = new GestoreAccordo();
			IGestoreAccordo igestoreAccordo = (IGestoreAccordo) UnicastRemoteObject.exportObject(gestoreAccordo,0);
			registry.rebind("IGestoreAccordo", igestoreAccordo);
			
		}catch (RemoteException e){
			e.printStackTrace();
			System.out.println("Proxy error");
		}
	}

}
