package dataBase;
import java.time.LocalDate;
import java.sql.Date;
import java.util.List;
import java.util.Locale;

import domain.Utente;
import domain.Profilo;

import java.text.DateFormat;
import java.time.LocalDate;

public class DemoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Utente> listaUtenti = null;
		UtenteDAO utenteDAO = new UtenteDAO();
		listaUtenti = utenteDAO.getAllUtenti();
		for(Utente u : listaUtenti) {
			System.out.format("%s, %s, %s\n",u.getNome(),u.getCognome(),u.getDataNascita());
		}
//		TEST INSERIMENTO NUOVO UTENTE
/*  		LocalDate local = LocalDate.of(1999, 01, 30);
		Date date = Date.valueOf(local);
		Utente u= new Utente("leo","messi","lmessi@gmail.com","aaaa",date,308952845,"leomessi");
		utenteDAO.createUtente(u);
*/		
/*		TEST MODIFICA PARAMENTI AD ECCEZIONE DELL'USERNAME CHE è CHIAVE ED è FISSA
 * 		listaUtenti.get(0).setNome("michele");
		utenteDAO.updateUtente(listaUtenti.get(0));
		listaUtenti = utenteDAO.getAllUtenti();
		for(Utente u : listaUtenti) {
			System.out.format("%s, %s, %s\n",u.getNome(),u.getCognome(),u.getDataNascita());
		}
		System.out.println(listaUtenti.get(0).getNome());
*/
/*		TEST ELIMINAZIONE UTENTE
		utenteDAO.deleteUtente(listaUtenti.get(0));
		listaUtenti = utenteDAO.getAllUtenti();
		for(Utente u : listaUtenti) {
			System.out.format("%s, %s, %s\n",u.getNome(),u.getCognome(),u.getDataNascita());
		}

*/	
/*		TEST RICHIESTA INFORMAZIONI UTENTE DATO L'USERNAME
		Utente u;
		u=utenteDAO.readUtente(listaUtenti.get(1).getUsername());
		System.out.print(u.getCellulare());
*/
/*		System.out.println(listaUtenti.get(1).getUsername());
		Profilo p;
		ProfiloDAO profiloDAO = new ProfiloDAO();
		p=profiloDAO.readProfilo(listaUtenti.get(1).getUsername());
		System.out.print(p.getnVisite());
*/
/*		//CREATEPROFILO FUNZIONA E VA UTILIZZATO NEL CONTROLLORE
		Profilo p=new Profilo("leomessi");
		ProfiloDAO profiloDAO = new ProfiloDAO();
		profiloDAO.createProfilo(p);
*/
	}

}


