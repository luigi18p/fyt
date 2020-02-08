package domain;

import java.io.Serializable;
import java.sql.Date;

public class Utente implements Serializable{


	private static final long serialVersionUID = 2131364514162756657L;

	private String nome;
	private String cognome;
	private String email;
	private String password;
	private Date dataNascita;
	private double cellulare;
	private String username;
	
	//controlla tutti i costruttori
	public Utente(String nome,String cognome,String email,String password,Date dataNascita,double cellulare,String username) {
		super();
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		this.password=password;
		this.dataNascita=dataNascita;
		this.cellulare=cellulare;
		this.username=username;
	}
	
	public Utente() {
		this.nome=null;
		this.cognome=null;
		this.email=null;
		this.password=null;
		this.dataNascita=null;
		this.cellulare=0;
		this.username=null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public double getCellulare() {
		return cellulare;
	}

	public void setCellulare(double cellulare) {
		this.cellulare = cellulare;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
