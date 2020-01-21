package domain;

import java.io.Serializable;
import java.sql.Date;

public class Accordo implements Serializable{

	private static final long serialVersionUID = 5270157970305317073L;
	
	private int idAnnuncio;
	Date dataAccordo;
	private String userVen;
	private String userAcq;
	private String reviewVen;
	private String reviewAcq;
	private int ratingVen;
	private int ratingAcq;

	public Accordo(int idAnnuncio, Date dataAccordo, String userVen, String userAcq, String reviewVen,
			String reviewAcq, int ratingVen, int ratingAcq) {
		super();
		this.idAnnuncio = idAnnuncio;
		this.dataAccordo = dataAccordo;
		this.userVen = userVen;
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

	public int getIdAnnuncio() {
		return idAnnuncio;
	}

	public void setIdAnnuncio(int idAnnuncio) {
		this.idAnnuncio = idAnnuncio;
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