package domain;

import java.sql.Date;

public class Accordo {

	private String userVen;
	private int idBiglietto;
	Date dataAccordo;
	private String userAcq;
	private String reviewVen;
	private String reviewAcq;
	private int ratingVen;
	private int ratingAcq;

	public Accordo(String userVen, int idBiglietto, Date dataAccordo, String userAcq, String reviewVen,
			String reviewAcq, int ratingVen, int ratingAcq) {
		super();
		this.userVen = userVen;
		this.idBiglietto = idBiglietto;
		this.dataAccordo = dataAccordo;
		this.userAcq = userAcq;
		this.reviewVen = reviewVen;
		this.reviewAcq = reviewAcq;
		this.ratingVen = ratingVen;
		this.ratingAcq = ratingAcq;
	}

	public String getUserVen() {
		return userVen;
	}

	public void setUserVen(String userVen) {
		this.userVen = userVen;
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

	public String getUserAcq() {
		return userAcq;
	}

	public void setUserAcq(String userAcq) {
		this.userAcq = userAcq;
	}

	public String getReviewVen() {
		return reviewVen;
	}

	public void setReviewVen(String reviewVen) {
		this.reviewVen = reviewVen;
	}

	public String getReviewAcq() {
		return reviewAcq;
	}

	public void setReviewAcq(String reviewAcq) {
		this.reviewAcq = reviewAcq;
	}

	public int getRatingVen() {
		return ratingVen;
	}

	public void setRatingVen(int ratingVen) {
		this.ratingVen = ratingVen;
	}

	public int getRatingAcq() {
		return ratingAcq;
	}

	public void setRatingAcq(int ratingAcq) {
		this.ratingAcq = ratingAcq;
	}
}