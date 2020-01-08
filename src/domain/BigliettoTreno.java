package domain;
import java.sql.Date;

public class BigliettoTreno extends Biglietto{

	private String classe_T;
	private String fermate_T;
	
	public BigliettoTreno(int id, String userVen, String nominativo, Date dataAndata, Date dataRitorno, String tipoTrasporto,
			Boolean tipologiaAR, float prezzoAcquisto, int numeroDiPosti, String idTicket, String partenza, String arrivo,
			String compagnia, String classe, String fermate) {
		super(id, userVen, nominativo, dataAndata, dataRitorno, tipoTrasporto, tipologiaAR, prezzoAcquisto, numeroDiPosti,
				idTicket, partenza, arrivo, compagnia);
		this.classe_T = classe_T;
		this.fermate_T = fermate_T;
	}
	public BigliettoTreno(int id) {
		super(id);
	}

	public String getClasse_T() {
		return classe_T;
	}

	public void setClasse_T(String classe_T) {
		this.classe_T = classe_T;
	}

	public String getFermate_T() {
		return fermate_T;
	}

	public void setFermate_T(String fermate_T) {
		this.fermate_T = fermate_T;
	}
}
