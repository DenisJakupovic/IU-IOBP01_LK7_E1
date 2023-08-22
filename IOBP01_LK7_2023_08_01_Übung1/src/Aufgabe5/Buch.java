package Aufgabe5;

public class Buch extends Medium{
	private String isbn;
	
	public Buch(String titel, int anzahlExemplare, String isbn)
	{
		this(titel, "", anzahlExemplare, isbn);
	}
	
	public Buch (String titel, String unterTitel, int anzahlExemplare, String isbn)
	{
		super(titel, unterTitel, anzahlExemplare);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBeschreibung ()
	{
		return "Buch: " + super.getBeschreibung() + ", ISBN;" + isbn;
	}
}
