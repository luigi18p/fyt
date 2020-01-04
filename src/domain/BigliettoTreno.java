package domain;

import java.util.Date;

public class BigliettoTreno extends Biglietto{

	private String stazionePartenza;
	private String stazioneArrivo;
	private int classe;
	private String fermate;
	private String compagniaFerrov;
	
	public BigliettoTreno(String nominativo, Date dataAndata, Date dataRitorno, Boolean tipologiaAR,
			float prezzoAcquisto, int numeroDiPosti, int idBiglietto, String stazionePartenza, String stazioneArrivo,
			int classe, String fermate, String compagniaFerrov) {
		super(nominativo, dataAndata, dataRitorno, tipologiaAR, prezzoAcquisto, numeroDiPosti, idBiglietto);
		this.stazionePartenza = stazionePartenza;
		this.stazioneArrivo = stazioneArrivo;
		this.classe = classe;
		this.fermate = fermate;
		this.compagniaFerrov = compagniaFerrov;
	}

	public String getStazionePartenza() {
		return stazionePartenza;
	}

	public void setStazionePartenza(String stazionePartenza) {
		this.stazionePartenza = stazionePartenza;
	}

	public String getStazioneArrivo() {
		return stazioneArrivo;
	}

	public void setStazioneArrivo(String stazioneArrivo) {
		this.stazioneArrivo = stazioneArrivo;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public String getFermate() {
		return fermate;
	}

	public void setFermate(String fermate) {
		this.fermate = fermate;
	}

	public String getCompagniaFerrov() {
		return compagniaFerrov;
	}

	public void setCompagniaFerrov(String compagniaFerrov) {
		this.compagniaFerrov = compagniaFerrov;
	}

}
