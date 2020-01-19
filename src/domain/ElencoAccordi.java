package domain;

import java.io.Serializable;
import java.util.ArrayList;

public class ElencoAccordi implements Serializable{

	private static final long serialVersionUID = -716023130982332343L;
	private ArrayList<Accordo> elencoAccordi;
	
	public ElencoAccordi() {
		setElencoAccordi(null);
	}

	public ArrayList<Accordo> getElencoAccordi() {
		return elencoAccordi;
	}

	public void setElencoAccordi(ArrayList<Accordo> elencoAccordi) {
		this.elencoAccordi = elencoAccordi;
	}

}
