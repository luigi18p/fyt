package domain;

import java.io.Serializable;
import java.util.ArrayList;

public class CatalogoPersonale implements Serializable{

	private static final long serialVersionUID = 1664628525115107360L;
	private ArrayList<Annuncio> elencoAnnunci;

	public CatalogoPersonale() {
		setElencoAnnunci(null);
	}

	public ArrayList<Annuncio> getElencoAnnunci() {
		return elencoAnnunci;
	}

	public void setElencoAnnunci(ArrayList<Annuncio> elencoAnnunci) {
		this.elencoAnnunci = elencoAnnunci;
	}
}
