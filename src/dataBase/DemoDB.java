package dataBase;

import java.util.List;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import java.time.LocalDate;



public class DemoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Utente> listaUtenti = null;
		UtenteDAO utenteDAO = new UtenteDAO();
		listaUtenti = utenteDAO.getAllUtenti();
		for(Utente u : listaUtenti) {
			System.out.format("%s, %s\n",u.getNome(),u.getCognome());
		}
		
		
		
	
	}

}


