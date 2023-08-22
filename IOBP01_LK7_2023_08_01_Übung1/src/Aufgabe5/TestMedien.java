package Aufgabe5;

public class TestMedien {

	public static void main(String[] args) {
		Medium m1 = new Medium("Unbekanntes Medium", 2);
		Buch b1 = new Buch ("C als erste Programmiersprache", 5, "123-456-345-21");		
		Zeitschrift z1 = new Zeitschrift ("Java Spektrum", 6, "123-456-345-22");
		Buch b2 = new Buch ("C als erste Programmiersprachen", "vom Einsteiger zum Profi", 5, "123-456-345-21");		
		Zeitschrift z2 = new Zeitschrift ("Speckdrum", "Hoi", 6, "123-456-345-22");

		
		Medium[] arr = new Medium[5];
		arr[0] = m1;
		arr[1] = b1;
		arr[2] = z1;
		arr[3] = b2;
		arr[4] = z2;
		
		for (Medium ref : arr) {
			System.out.println(ref.getBeschreibung());
		}
	}

}
