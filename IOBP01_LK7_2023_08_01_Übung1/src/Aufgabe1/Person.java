package Aufgabe1;

public class Person {
	private String name;
	private String vorname;

	public Person() 
	{
		name = "Unbekannt";
		vorname = "Unbekannt";
	}
	
	public Person(String name, String vorname)
	{
		this.name = name;
		this.vorname = vorname;
	}

	public void setName(Person this, String name) {
		this.name = name;
	}

	public void setVorname(Person this, String vorname) {
		this.vorname = vorname;
	}

	public String getName(Person this) {

		return this.name;
	}

	public String getVorname(Person this) {
		return this.vorname;
	}
	
	public String getBeschreibung() {
		return "Name: " + this.name + ", Vorname: " + this.vorname;
	}
}
