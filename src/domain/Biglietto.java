package domain;

import java.io.Serializable;
import java.sql.Date;

public abstract class Biglietto implements Serializable{
	
	private static final long serialVersionUID = -4675652955592640591L;
	private int id;
	private String nominativo;
	private Date dataAndata;
	private Date dataRitorno;
	private Boolean tipologiaAR;
	private float prezzoAcquisto;
	private int numeroDiPosti;
	private String idTicket;
	protected String partenza;
	protected String arrivo;
	private String compagnia;

	public Biglietto(int id, String nominativo, Date dataAndata, Date dataRitorno, Boolean tipologiaAR, 
			float prezzoAcquisto, int numeroDiPosti, String idTicket, String partenza, String arrivo,
			String compagnia) {
		super();
		this.id = id;
		this.nominativo = nominativo;
		this.dataAndata = dataAndata;
		this.dataRitorno = dataRitorno;
		this.tipologiaAR = tipologiaAR;
		this.prezzoAcquisto = prezzoAcquisto;
		this.numeroDiPosti = numeroDiPosti;
		this.idTicket = idTicket;
		this.partenza = partenza;
		this.arrivo = arrivo;
		this.compagnia = compagnia;
	}

	public Biglietto(int id) {
		super();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public Date getDataAndata() {
		return dataAndata;
	}

	public void setDataAndata(Date dataAndata) {
		this.dataAndata = dataAndata;
	}

	public Date getDataRitorno() {
		return dataRitorno;
	}

	public void setDataRitorno(Date dataRitorno) {
		this.dataRitorno = dataRitorno;
	}

	public Boolean getTipologiaAR() {
		return tipologiaAR;
	}

	public void setTipologiaAR(Boolean tipologiaAR) {
		this.tipologiaAR = tipologiaAR;
	}

	public float getPrezzoAcquisto() {
		return prezzoAcquisto;
	}

	public void setPrezzoAcquisto(float prezzoAcquisto) {
		this.prezzoAcquisto = prezzoAcquisto;
	}

	public int getNumeroDiPosti() {
		return numeroDiPosti;
	}

	public void setNumeroDiPosti(int numeroDiPosti) {
		this.numeroDiPosti = numeroDiPosti;
	}

	public String getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}

	public String getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}
	
	public abstract String getPartenza();

	public abstract String getArrivo();
	
}
