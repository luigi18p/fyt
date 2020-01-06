package controller;

import dataBase.ProfiloDAO;
import domain.Profilo;

public class GestoreProfilo {
	
	public int createProfilo(String username) {
		
		Profilo profilo = new Profilo(username);
		ProfiloDAO profiloDAO = new ProfiloDAO();
		profiloDAO.createProfilo(profilo);
		
		return 0;
		
	}

}
