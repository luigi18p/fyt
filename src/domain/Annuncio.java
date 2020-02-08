package domain;

import java.io.Serializable;

import dataBase.AnnuncioDAO;

public class Annuncio implements Serializable{

	private static final long serialVersionUID = -9006105091683784824L;
	
	private int idAnnuncio;
	private String username;
	private String descrizione;
	private float prezzoRichiesto;
	private String tipoTrasporto;
	
	public Annuncio(int idAnnuncio, String username, String descrizione, float prezzoRichiesto,String tipoTrasporto) {
		super();
		this.username = username;
		this.idAnnuncio = idAnnuncio;
		this.descrizione = descrizione;
		this.prezzoRichiesto = prezzoRichiesto;
		this.tipoTrasporto = tipoTrasporto;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getIdAnnuncio() {
		return idAnnuncio;
	}
	public void setIdAnnuncio(int idAnnuncio) {
		this.idAnnuncio = idAnnuncio;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public float getPrezzoRichiesto() {
		return prezzoRichiesto;
	}
	public void setPrezzoRichiesto(float prezzoRichiesto) {
		this.prezzoRichiesto = prezzoRichiesto;
	}

	public String getTipoTrasporto() {
		return tipoTrasporto;
	}

	public void setTipoTrasporto(String tipoTrasporto) {
		this.tipoTrasporto = tipoTrasporto;
	}
	
	public static void deleteAnnuncio(int id) {
		AnnuncioDAO annuncioDAO = new AnnuncioDAO();
		annuncioDAO.deleteAnnuncio(id);
	}
}
