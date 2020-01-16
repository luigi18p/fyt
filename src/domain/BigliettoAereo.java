package domain;
import java.io.Serializable;
import java.sql.Date;

public class BigliettoAereo extends Biglietto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7722072505495865642L;
	private boolean priority;
	private boolean diretto;
	private String areopScalo_A;
	private int attesaScalo_A;
	private boolean bagaglioStiva_A;
	private boolean bagaglioAMano_A;
	private boolean assicurazione_A;
	
	public BigliettoAereo(int id, String userVen, String nominativo, Date dataAndata, Date dataRitorno, String tipoTrasporto,
			Boolean tipologiaAR, float prezzoAcquisto, int numeroDiPosti, String idTicket, String partenza, String arrivo,
			String compagnia, boolean priority, boolean diretto, String areopScalo_A, int attesaScalo_A,
			boolean bagaglioStiva_A, boolean bagaglioAMano_A, boolean assicurazione_A) {
		super(id, userVen, nominativo, dataAndata, dataRitorno, tipoTrasporto, tipologiaAR, prezzoAcquisto, numeroDiPosti, 
				idTicket, partenza, arrivo, compagnia);
		this.priority = priority;
		this.diretto = diretto;
		this.areopScalo_A = areopScalo_A;
		this.attesaScalo_A = attesaScalo_A;
		this.bagaglioStiva_A = bagaglioStiva_A;
		this.bagaglioAMano_A = bagaglioAMano_A;
		this.assicurazione_A = assicurazione_A;
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

	public String getAreopScalo_A() {
		return areopScalo_A;
	}

	public void setAreopScalo_A(String areopScalo_A) {
		this.areopScalo_A = areopScalo_A;
	}

	public int getAttesaScalo_A() {
		return attesaScalo_A;
	}

	public void setAttesaScalo_A(int attesaScalo_A) {
		this.attesaScalo_A = attesaScalo_A;
	}

	public boolean isBagaglioStiva_A() {
		return bagaglioStiva_A;
	}

	public void setBagaglioStiva_A(boolean bagaglioStiva_A) {
		this.bagaglioStiva_A = bagaglioStiva_A;
	}

	public boolean isBagaglioAMano_A() {
		return bagaglioAMano_A;
	}

	public void setBagaglioAMano_A(boolean bagaglioAMano_A) {
		this.bagaglioAMano_A = bagaglioAMano_A;
	}

	public boolean isAssicurazione_A() {
		return assicurazione_A;
	}

	public void setAssicurazione_A(boolean assicurazione_A) {
		this.assicurazione_A = assicurazione_A;
	}
}
