package learning;
import java.time.LocalDate;
import java.sql.Date;
import java.util.List;
import java.util.Locale;

import domain.Utente;
import domain.Annuncio;
import domain.Biglietto;
import domain.BigliettoAereo;
import domain.BigliettoTreno;
import domain.Profilo;

import java.text.DateFormat;
import java.time.LocalDate;

public class DemoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				TEST INSERIMENTO NUOVO UTENTE
		
/*  	LocalDate local = LocalDate.of(1999, 01, 30);
		Date date = Date.valueOf(local);
		Utente u= new Utente("andrea","iovino","andreaiov@gmail.com","aaaa",date,4353654,"andreaiov");
		utenteDAO.createUtente(u);
*/		
		//TEST MODIFICA PARAMENTI AD ECCEZIONE DELL'USERNAME CHE è CHIAVE ED è FISSA
 
 /* 		listaUtenti.get(0).setNome("michele");
		utenteDAO.updateUtente(listaUtenti.get(0));
		listaUtenti = utenteDAO.getAllUtenti();
		for(Utente u : listaUtenti) {
			System.out.format("%s, %s, %s\n",u.getNome(),u.getCognome(),u.getDataNascita());
		}
		System.out.println(listaUtenti.get(0).getNome());
*/
/*
		  //		TEST ELIMINAZIONE UTENTE
		 
		utenteDAO.deleteUtente(listaUtenti.get(1));
		listaUtenti = utenteDAO.getAllUtenti();
		for(Utente u : listaUtenti) {
			System.out.format("%s, %s, %s\n",u.getNome(),u.getCognome(),u.getDataNascita());
		}
		
*/
	
		//TEST RICHIESTA INFORMAZIONI UTENTE DATO L'USERNAME
  
/*		Utente u;
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
		
		Profilo p=new Profilo("andreaiov");
		ProfiloDAO profiloDAO = new ProfiloDAO();
		profiloDAO.createProfilo(p);
*/
/*		
		List<Annuncio> listaAnnunci = null;
		AnnuncioDAO AnnuncioDAO = new AnnuncioDAO();
		listaAnnunci = AnnuncioDAO.getAllAnnunci();
		for(Annuncio a : listaAnnunci) {
			System.out.format("%s, %s, %s\n",a.getUsername(),a.getDescrizione(),a.getPrezzoRichiesto());
		}
		List<Annuncio> listaAnnunci1 = null;
		AnnuncioDAO AnnuncioDAO1 = new AnnuncioDAO();
		listaAnnunci1 = AnnuncioDAO1.getAllAnnunciPersonali("luipalermo");
		for(Annuncio a : listaAnnunci1) {
			System.out.format("%s, %s, %s\n",a.getUsername(),a.getDescrizione(),a.getPrezzoRichiesto());
	}
*/		
/*		//CREATE BIGLIETTO T/A CRUD, ANNUNCIO CRUD
		LocalDate local = LocalDate.of(1999, 01, 30);
		Date date = Date.valueOf(local);
		BigliettoTreno b = new BigliettoTreno(0,"gioascala", "maschile", date, null, "treno", true, 0, 0, "a1111", "napoli", "milano", "trenitalia", "economy", null);
		
		BigliettoDAO bigliettoDAO = new BigliettoDAO();
		bigliettoDAO.createBigliettoTreno(b);
		b.setId(bigliettoDAO.readIdBiglietto("gioascala","treno"));
		System.out.println(b.getId() + "-" + b.getPartenza());
		
		int ris;
		b.setPartenza("palermo");
		ris=bigliettoDAO.updateBigliettoTreno(b);
		
		BigliettoAereo ba = new BigliettoAereo(0,"gioascala", "maschile", date, null, "aereo", true, 50, 1, "a1111", "napoli", "milano", "alitalia",false,false,null,0,false,false,false);
		bigliettoDAO.createBigliettoAereo(ba);
		ba.setId(bigliettoDAO.readIdBiglietto("gioascala","aereo"));
		ba.setPartenza("catania");
		ris=bigliettoDAO.updateBigliettoAereo(ba);
		
		Annuncio a= new Annuncio("gioascala", b.getId(), null, 0);
		AnnuncioDAO annuncioDAO = new AnnuncioDAO();
		annuncioDAO.createAnnuncio(a);
		
		//annuncioDAO.deleteAnnuncio(a);
		//bigliettoDAO.deleteBiglietto(b.getId());
*/		

	}

}


