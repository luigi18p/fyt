package demo;

import java.util.Calendar;

import domain.Accordo;
import domain.ElencoAccordi;

public class creaAccordo {
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ElencoAccordi elencoAccordi = new ElencoAccordi();
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		@SuppressWarnings("unused")
		Accordo a = new Accordo(2, date, "ven", "a", "reviewVen", null, 2, 0);
	}

}
