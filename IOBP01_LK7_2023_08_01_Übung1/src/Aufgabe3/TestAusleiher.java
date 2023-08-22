package Aufgabe3;
import java.util.Scanner;

public class TestAusleiher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ausleiher a1 = new Ausleiher("Mustermann", "Max", 100);
		Ausleiher a2 = new Ausleiher(scan);
		Ausleiher a3 = new Ausleiher(scan);
		
		System.out.println (a1.getBeschreibung());
		System.out.println (a2.getBeschreibung());
		System.out.println (a3.getBeschreibung());

		
		scan.close();
	}

}
