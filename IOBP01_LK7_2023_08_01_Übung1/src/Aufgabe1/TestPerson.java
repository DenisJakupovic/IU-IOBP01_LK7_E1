package Aufgabe1;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Mustermann", "Lisa");
		
		System.out.println(p1.getBeschreibung());
		System.out.println(p2.getBeschreibung());

	}

}
