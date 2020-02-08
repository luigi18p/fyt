package domain;
import java.io.Serializable;
import java.sql.Date;

public class BigliettoAereo extends Biglietto implements Serializable{
	
	private static final long serialVersionUID = 7722072505495865642L;
	private String postoAssegnato;
	private boolean priority;
	private boolean diretto;
	private String areopScalo;
	private int attesaScalo;
	private boolean bagaglioStiva;
	private boolean bagaglioAMano;
	private boolean assicurazione;
	
	public BigliettoAereo(int id, String nominativo, Date dataAndata, Date dataRitorno,
			Boolean tipologiaAR, float prezzoAcquisto, int numeroDiPosti, String idTicket, String partenza, String arrivo,
			String compagnia, String postoAssegnato, boolean priority, boolean diretto, String areopScalo, int attesaScalo,
			boolean bagaglioStiva, boolean bagaglioAMano, boolean assicurazione) {
		super(id, nominativo, dataAndata, dataRitorno, tipologiaAR, prezzoAcquisto, numeroDiPosti, 
				idTicket, partenza, arrivo, compagnia);
		this.setPostoAssegnato(postoAssegnato);
		this.priority = priority;
		this.diretto = diretto;
		this.areopScalo = areopScalo;
		this.attesaScalo = attesaScalo;
		this.bagaglioStiva = bagaglioStiva;
		this.bagaglioAMano = bagaglioAMano;
		this.assicurazione = assicurazione;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
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

	public void setAreopScalo_A(String areopScalo) {
		this.areopScalo = areopScalo;
	}

	public int getAttesaScalo() {
		return attesaScalo;
	}

	public void setAttesaScalo_A(int attesaScalo) {
		this.attesaScalo = attesaScalo;
	}

	public boolean isBagaglioStiva() {
		return bagaglioStiva;
	}

	public void setBagaglioStiva_A(boolean bagaglioStiva) {
		this.bagaglioStiva = bagaglioStiva;
	}

	public boolean isBagaglioAMano_A() {
		return bagaglioAMano;
	}

	public void setBagaglioAMano_A(boolean bagaglioAMano) {
		this.bagaglioAMano = bagaglioAMano;
	}

	public boolean isAssicurazione() {
		return assicurazione;
	}

	public void setAssicurazione_A(boolean assicurazione_A) {
		this.assicurazione = assicurazione_A;
	}
	
	@Override
	public String getPartenza() {

		String p = "Aereoporto di "+this.partenza;
		return p;
	}

	@Override
	public String getArrivo() {

		String a = "Aereoporto di "+this.arrivo;
		return a;
	}

	public String getPostoAssegnato() {
		return postoAssegnato;
	}

	public void setPostoAssegnato(String postoAssegnato) {
		this.postoAssegnato = postoAssegnato;
	}

}
