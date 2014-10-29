package personen;

import java.io.Serializable;

public class Persoon implements Serializable  {
	private String naam;
	private String achternaam;
	
	public Persoon (String naam, String achternaam){
		this.naam = naam;
		this.achternaam = achternaam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	
	public String toString() {
		String gegevens = naam + ", " + achternaam;
		return gegevens;
		}
	}