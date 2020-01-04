package domain;

import java.util.Date;

public class Biglietto {
	
	
	private String nominativo;
	private Date dataAndata;
	private Date dataRitorno;
	private Boolean tipologiaAR;
	private float prezzoAcquisto;
	private int numeroDiPosti;
	private int idTicket;

	public Biglietto(String nominativo, Date dataAndata, Date dataRitorno, Boolean tipologiaAR, 
			float prezzoAcquisto, int numeroDiPosti, int idTicket) {
		super();
		this.nominativo = nominativo;
		this.dataAndata = dataAndata;
		this.dataRitorno = dataRitorno;
		this.tipologiaAR = tipologiaAR;
		//this.tipoTrasporto = tipoTrasporto;
		this.prezzoAcquisto = prezzoAcquisto;
		this.numeroDiPosti = numeroDiPosti;
		this.idTicket = idTicket;
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

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

}
