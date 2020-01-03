package dataBase;

import java.util.Date;

public class Utente {

	private String nome;
	private String cognome;
	private String email;
	private String password;
	private Date dataNascita;
	private int cellulare;
	private String username;
	
	public Utente(String nome,String cognome,String email,String password,Date dataNascita,int cellulare,String username) {
		super();
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		this.password=password;
		this.dataNascita=dataNascita;
		this.cellulare=cellulare;
		this.username=username;
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

	public int getCellulare() {
		return cellulare;
	}

	public void setCellulare(int cellulare) {
		this.cellulare = cellulare;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
