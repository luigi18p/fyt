package demo;

import domain.Annuncio;
import domain.CatalogoPersonale;
import domain.Profilo;

public class demoprova {

	public static void main(String[] args) {

		CatalogoPersonale cp = new CatalogoPersonale();
		cp.getAllAnnunciPersonali("a");
		for(Annuncio a : cp.getElencoAnnunci())
			System.out.println(a.getIdAnnuncio());
		
		Profilo p = new Profilo();
		System.out.println(p.checkProfilo("aaaaaa"));
	}

}
