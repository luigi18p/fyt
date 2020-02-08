package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import dataBase.AccordoDAO;

public class ElencoAccordi implements Serializable{

	private static final long serialVersionUID = -716023130982332343L;
	private List<Accordo> elencoAccordi;
	
	public ElencoAccordi() {
		elencoAccordi = new ArrayList<Accordo>();
	}

	public List<Accordo> getElencoAccordi() {
		return elencoAccordi;
	}

	public void setElencoAccordi(List<Accordo> elencoAccordi) {
		this.elencoAccordi = elencoAccordi;
	}
	
	public void createAccordo(int id, String venditore, String acquirente, String reviewVen, int ratingVen){
		
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		Accordo a = new Accordo(id, date, venditore, acquirente, reviewVen, null, ratingVen, 0);
		
		elencoAccordi.add(a);
		
		AccordoDAO accordoDAO = new AccordoDAO();
		accordoDAO.createAccordo(a);
	}

}
