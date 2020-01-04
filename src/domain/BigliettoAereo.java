package domain;

import java.util.Date;

public class BigliettoAereo extends Biglietto{
	
	private String areopPartenza;
	private String areopArrivo;
	private boolean priority;
	private String postoAssegnato;
	private boolean diretto;
	private String areopScalo;
	private int attesaScalo;
	private boolean bagaglioStiva;
	private boolean bagaglioAMano;
	private boolean assicurazione;
	private String compagniaAerea;

	public BigliettoAereo(String nominativo, Date dataAndata, Date dataRitorno, Boolean tipologiaAR,
			float prezzoAcquisto, int numeroDiPosti, int idBiglietto, String areopPartenza, String areopArrivo,
			boolean priority, String postoAssegnato, boolean diretto, String areopScalo, int attesaScalo,
			boolean bagaglioStiva, boolean bagaglioAMano, boolean assicurazione, String compagniaAerea) {
		super(nominativo, dataAndata, dataRitorno, tipologiaAR, prezzoAcquisto, numeroDiPosti, idBiglietto);
		this.areopPartenza = areopPartenza;
		this.areopArrivo = areopArrivo;
		this.priority = priority;
		this.postoAssegnato = postoAssegnato;
		this.diretto = diretto;
		this.areopScalo = areopScalo;
		this.attesaScalo = attesaScalo;
		this.bagaglioStiva = bagaglioStiva;
		this.bagaglioAMano = bagaglioAMano;
		this.assicurazione = assicurazione;
		this.compagniaAerea = compagniaAerea;
	}

	public String getAreopPartenza() {
		return areopPartenza;
	}

	public void setAreopPartenza(String areopPartenza) {
		this.areopPartenza = areopPartenza;
	}

	public String getAreopArrivo() {
		return areopArrivo;
	}

	public void setAreopArrivo(String areopArrivo) {
		this.areopArrivo = areopArrivo;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public String getPostoAssegnato() {
		return postoAssegnato;
	}

	public void setPostoAssegnato(String postoAssegnato) {
		this.postoAssegnato = postoAssegnato;
	}

	public boolean isDiretto() {
		return diretto;
	}

	public void setDiretto(boolean diretto) {
		this.diretto = diretto;
	}

	public String getAreopScalo() {
		return areopScalo;
	}

	public void setAreopScalo(String areopScalo) {
		this.areopScalo = areopScalo;
	}

	public int getAttesaScalo() {
		return attesaScalo;
	}

	public void setAttesaScalo(int attesaScalo) {
		this.attesaScalo = attesaScalo;
	}

	public boolean isBagaglioStiva() {
		return bagaglioStiva;
	}

	public void setBagaglioStiva(boolean bagaglioStiva) {
		this.bagaglioStiva = bagaglioStiva;
	}

	public boolean isBagaglioAMano() {
		return bagaglioAMano;
	}

	public void setBagaglioAMano(boolean bagaglioAMano) {
		this.bagaglioAMano = bagaglioAMano;
	}

	public boolean isAssicurazione() {
		return assicurazione;
	}

	public void setAssicurazione(boolean assicurazione) {
		this.assicurazione = assicurazione;
	}

	public String getCompagniaAerea() {
		return compagniaAerea;
	}

	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}
	
}
