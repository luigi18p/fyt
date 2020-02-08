package domain;

import java.io.Serializable;

import dataBase.ProfiloDAO;

public class Profilo implements Serializable{

	private static final long serialVersionUID = -8566500390958844860L;
	//genera serial id
	private String username;
	private int totaleBigliettiInVendita;
	private int mediaFeedback;
	private int nVisite;
	
	//controlla tutti i costruttori
	public Profilo() {
		this.username = null;
		this.totaleBigliettiInVendita = 0;
		this.mediaFeedback = 0;
		this.nVisite = 0;
	}
	
	public Profilo(String username, int totaleBigliettiInVendita, int mediaFeedback, int nVisite) {
		super();
		this.username = username;
		this.totaleBigliettiInVendita = totaleBigliettiInVendita;
		this.mediaFeedback = mediaFeedback;
		this.nVisite = nVisite;
	}
	
	public Profilo(String username) {
		super();
		this.username = username;
		this.totaleBigliettiInVendita = 0;
		this.mediaFeedback = 0;
		this.nVisite = 0;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getTotaleBigliettiInVendita() {
		return totaleBigliettiInVendita;
	}
	public void setTotaleBigliettiInVendita(int totaleBigliettiInVendita) {
		this.totaleBigliettiInVendita = totaleBigliettiInVendita;
	}
	public int getMediaFeedback() {
		return mediaFeedback;
	}
	public void setMediaFeedback(int mediaFeedback) {
		this.mediaFeedback = mediaFeedback;
	}
	public int getnVisite() {
		return nVisite;
	}
	public void setnVisite(int nVisite) {
		this.nVisite = nVisite;
	}
	
	public boolean checkProfilo(String userAcq) {
		
		ProfiloDAO profiloDAO = new ProfiloDAO();
		String username = profiloDAO.readUsername(userAcq);
		if(username == null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public void updateRiepilogo(String username) {
		try {
			Profilo p = new Profilo(username);
			ProfiloDAO profiloDAO = new ProfiloDAO();
			p=profiloDAO.readProfilo(username);
			p.setTotaleBigliettiInVendita((p.getTotaleBigliettiInVendita())-1);
			profiloDAO.updateProfilo(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
