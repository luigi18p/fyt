package businessLogic;


import dataBase.ProfiloDAO;
import domain.Profilo;
import rmi.IGestoreProfilo;

public class GestoreProfilo implements IGestoreProfilo{
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//_______________________________________ALTRO
	public int createProfilo(String username) {
		
		try {
			Profilo profilo = new Profilo(username);
			ProfiloDAO profiloDAO = new ProfiloDAO();
			profiloDAO.createProfilo(profilo);
			
			return 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public void IncrementaAnnunci(String username) {
		try {
			Profilo p = new Profilo(username);
			ProfiloDAO profiloDAO = new ProfiloDAO();
			p=profiloDAO.readProfilo(username);
			p.setTotaleBigliettiInVendita((p.getTotaleBigliettiInVendita())+1);
			profiloDAO.updateProfilo(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Profilo ReadProfilo(String username) {
		try {
			Profilo p = new Profilo(username);
			ProfiloDAO profiloDAO = new ProfiloDAO();
			p = profiloDAO.readProfilo(username);
			return p;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
