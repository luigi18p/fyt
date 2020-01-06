package controller;

import java.sql.Date;

import dataBase.ProfiloDAO;
import dataBase.UtenteDAO;
import domain.Profilo;
import domain.Utente;

public class GestoreUtente {
	
	public int Registrazione(String nome, String cognome, String email, String password, 
			Date dataNascita, double cellulare, String username) {
		
		if(username.length() <10 && password.length() <10) {
			Utente utente = new Utente(nome, cognome, email, password, dataNascita, cellulare, username);
			UtenteDAO utenteDAO = new UtenteDAO();
			utenteDAO.createUtente(utente);
			
			GestoreProfilo gestoreProfilo = new GestoreProfilo();
			gestoreProfilo.createProfilo(username);

		}
		return 0;
	}
	
	public int Login(String username, String password){
		if(username.length() <10 && password.length() <10) {
			
			Utente uVerifica = new Utente();
			UtenteDAO utenteDAO = new UtenteDAO();
			uVerifica = utenteDAO.readUtenteLogin(username, password);
			
			int var1 = uVerifica.getUsername().compareTo( username );
			int var2 = uVerifica.getPassword().compareTo( password );
            if (var1 == var2) {
            	return 0;
            }
		}
		return 1;
	};

	public int updateUtente(Utente u) {
		UtenteDAO utenteDAO = new UtenteDAO();
		utenteDAO.updateUtente(u);
		return 0;
	};
}
