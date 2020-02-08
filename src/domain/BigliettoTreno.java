package domain;
import java.io.Serializable;
import java.sql.Date;

public class BigliettoTreno extends Biglietto implements Serializable{

	private static final long serialVersionUID = -2757140573802332518L;
	private String classe;
	private String fermate;
	
	public BigliettoTreno(int id, String nominativo, Date dataAndata, Date dataRitorno, Boolean tipologiaAR, 
			float prezzoAcquisto, int numeroDiPosti, String idTicket, String partenza, String arrivo,
			String compagnia, String classe, String fermate) {
		super(id, nominativo, dataAndata, dataRitorno, tipologiaAR, prezzoAcquisto, numeroDiPosti,
				idTicket, partenza, arrivo, compagnia);
		this.classe = classe;
		this.fermate = fermate;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse_T(String classe) {
		this.classe = classe;
	}

	public String getFermate() {
		return fermate;
	}

	public void setFermate_T(String fermate) {
		this.fermate = fermate;
	}

	@Override
	public String getPartenza() {

		String p = "Stazione di "+this.partenza;
		return p;
	}

	@Override
	public String getArrivo() {

		String a = "Stazione di "+this.arrivo;
		return a;
	}
}
