package domain;

import java.sql.Date;

public class Accordo {

	private String usernameVenditore;
	private int idBiglietto;
	Date dataAccordo;
	private String usernameAcquirente;
	private String descrizioneV;
	private String descrizioneA;
	private int stelleV;
	private int stelleA;
	
	public Accordo(String usernameVenditore, int idBiglietto, Date dataAccordo, String usernameAcquirente,
			String descrizioneV, String descrizioneA, int stelleV, int stelleA) {
		super();
		this.usernameVenditore = usernameVenditore;
		this.idBiglietto = idBiglietto;
		this.dataAccordo = dataAccordo;
		this.usernameAcquirente = usernameAcquirente;
		this.descrizioneV = descrizioneV;
		this.descrizioneA = descrizioneA;
		this.stelleV = stelleV;
		this.stelleA = stelleA;
	}
	
	public Accordo(String usernameVenditore, int idBiglietto, Date dataAccordo, String usernameAcquirente,
			String descrizioneV, int stelleV) {
		super();
		this.usernameVenditore = usernameVenditore;
		this.idBiglietto = idBiglietto;
		this.dataAccordo = dataAccordo;
		this.usernameAcquirente = usernameAcquirente;
		this.descrizioneV = descrizioneV;
		this.descrizioneA = null;
		this.stelleV = stelleV;
		this.stelleA = 0;
	}
	
	public String getUsernameVenditore() {
		return usernameVenditore;
	}
	public void setUsernameVenditore(String usernameVenditore) {
		this.usernameVenditore = usernameVenditore;
	}
	public int getIdBiglietto() {
		return idBiglietto;
	}
	public void setIdBiglietto(int idBiglietto) {
		this.idBiglietto = idBiglietto;
	}
	public Date getDataAccordo() {
		return dataAccordo;
	}
	public void setDataAccordo(Date dataAccordo) {
		this.dataAccordo = dataAccordo;
	}
	public String getUsernameAcquirente() {
		return usernameAcquirente;
	}
	public void setUsernameAcquirente(String usernameAcquirente) {
		this.usernameAcquirente = usernameAcquirente;
	}
	public String getDescrizioneV() {
		return descrizioneV;
	}
	public void setDescrizioneV(String descrizioneV) {
		this.descrizioneV = descrizioneV;
	}
	public String getDescrizioneA() {
		return descrizioneA;
	}
	public void setDescrizioneA(String descrizioneA) {
		this.descrizioneA = descrizioneA;
	}
	public int getStelleV() {
		return stelleV;
	}
	public void setStelleV(int stelleV) {
		this.stelleV = stelleV;
	}
	public int getStelleA() {
		return stelleA;
	}
	public void setStelleA(int stelleA) {
		this.stelleA = stelleA;
	}
}
