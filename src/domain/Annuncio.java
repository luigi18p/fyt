package domain;

public class Annuncio {

	private String username;
	private int idBiglietto;
	private String descrizione;
	private float prezzoRichiesto;
	
	public Annuncio(String username, int idBiglietto, String descrizione, float prezzoRichiesto) {
		super();
		this.username = username;
		this.idBiglietto = idBiglietto;
		this.descrizione = descrizione;
		this.prezzoRichiesto = prezzoRichiesto;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getIdBiglietto() {
		return idBiglietto;
	}
	public void setIdBiglietto(int idBiglietto) {
		this.idBiglietto = idBiglietto;
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
}
