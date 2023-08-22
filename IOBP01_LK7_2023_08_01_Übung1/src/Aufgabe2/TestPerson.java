package Aufgabe2;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person p1 = new Person();
		Person p2 = new Person("Mustermann", "Lisa");
		Person p3 = new Person(scan);
		Person p4 = new Person(scan);

		System.out.println(p1.getBeschreibung());
		System.out.println(p2.getBeschreibung());
		System.out.println(p3.getBeschreibung());
		System.out.println(p4.getBeschreibung());

		scan.close();
	}

}
