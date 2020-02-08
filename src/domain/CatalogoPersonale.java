package domain;

import java.io.Serializable;
import java.util.List;

import dataBase.AnnuncioDAO;

public class CatalogoPersonale implements Serializable{

	private static final long serialVersionUID = 1664628525115107360L;
	private List<Annuncio> catalogo;

	public CatalogoPersonale() {}
	
	public List<Annuncio> getAllAnnunciPersonali(String username) {
		
		AnnuncioDAO annuncioDAO = new AnnuncioDAO();
		this.setElencoAnnunci(annuncioDAO.getAllAnnunciPersonali(username));
		return catalogo;
	}

	public List<Annuncio> getElencoAnnunci() {
		return catalogo;
	}

	public void setElencoAnnunci(List<Annuncio> catalogo) {
		this.catalogo = catalogo;
	}
}
