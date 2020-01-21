package domain;

import java.io.Serializable;
import java.util.ArrayList;

import dataBase.AnnuncioDAO;

public class CatalogoPersonale implements Serializable{

	private static final long serialVersionUID = 1664628525115107360L;
	private ArrayList<Annuncio> catalogo;

	public CatalogoPersonale() {}
	
	public ArrayList<Annuncio> getAllAnnunciPersonali(String username) {
		
		AnnuncioDAO annuncioDAO = new AnnuncioDAO();
		this.setElencoAnnunci(annuncioDAO.getAllAnnunciPersonali(username));
		return catalogo;
	}

	public ArrayList<Annuncio> getElencoAnnunci() {
		return catalogo;
	}

	public void setElencoAnnunci(ArrayList<Annuncio> catalogo) {
		this.catalogo = catalogo;
	}
}
