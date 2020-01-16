package domain;

import java.io.Serializable;
import java.sql.Date;

public class Biglietto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4675652955592640591L;
	private int id;
	private String userVen;
	private String nominativo;
	private Date dataAndata;
	private Date dataRitorno;
	private String tipoTrasporto;
	private Boolean tipologiaAR;
	private float prezzoAcquisto;
	private int numeroDiPosti;
	private String idTicket;
	private String partenza;
	private String arrivo;
	private String compagnia;

	public Biglietto(int id, String userVen, String nominativo, Date dataAndata, Date dataRitorno, String tipoTrasporto,
			Boolean tipologiaAR, float prezzoAcquisto, int numeroDiPosti, String idTicket, String partenza, String arrivo,
			String compagnia) {
		super();
		this.id = id;
		this.userVen = userVen;
		this.nominativo = nominativo;
		this.dataAndata = dataAndata;
		this.dataRitorno = dataRitorno;
		this.tipoTrasporto = tipoTrasporto;
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

	public String getTipoTrasporto() {
		return tipoTrasporto;
	}

	public void setTipoTrasporto(String tipoTrasporto) {
		this.tipoTrasporto = tipoTrasporto;
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

	public String getPartenza() {
		return partenza;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public String getArrivo() {
		return arrivo;
	}

	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}

	public String getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}

	public String getUserVen() {
		return userVen;
	}

	public void setUserVen(String userVen) {
		this.userVen = userVen;
	}
}
