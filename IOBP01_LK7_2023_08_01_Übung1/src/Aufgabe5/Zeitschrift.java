package Aufgabe5;

public class Zeitschrift extends Medium{
	private String issn;

	public Zeitschrift(String titel, int anzahlExemplare, String issn)
	{
		this(titel, "", anzahlExemplare, issn);
	}
	
	public Zeitschrift(String titel, String unterTitel, int anzahlExemplare, String issn)
	{
		super(titel, unterTitel, anzahlExemplare);
		this.issn = issn;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getBeschreibung ()
	{
		return "Zeitschrift: " + super.getBeschreibung() + ", ISSN;" + issn;
	}
}
