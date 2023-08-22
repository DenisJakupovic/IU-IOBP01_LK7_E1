package Aufgabe3;

import java.util.Scanner;

public class Ausleiher extends Person{
	private int ausleiherNummer;

	
	public Ausleiher (String name, String vorname, int ausleiherNummer) {
	
		super(name, vorname);
		this.ausleiherNummer = ausleiherNummer;
	}
	
	public Ausleiher(Scanner ref) {
		super(ref);
		System.out.print("Ausleihernummer: ");
		ausleiherNummer = ref.nextInt();
		ref.nextLine();
	}
	
	public int getAusleiherNummer() {
		return ausleiherNummer;
	}

	public void setAusleiherNummer(int ausleiherNummer) {
		this.ausleiherNummer = ausleiherNummer;
	}

	public String getBeschreibung() {
		return super.getBeschreibung() + ", Ausleihernummer: " + this.ausleiherNummer;
	}
	
}
