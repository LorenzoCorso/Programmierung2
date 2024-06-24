package javaVideoKurs;

import klassen.Auto;

public class VergleichsOperatorenDemo {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * <
		 * >
		 * >=
		 * <=
		 * == 
		 * !=
		 * 
		 */
		
		double x = 6;
		long y = 3;
		
		boolean b = x < y;
		System.out.println(b);  // Impliziter Cast von Long in Double
		
		boolean b2 = true == false;   // Vergleicht ob ein Wert mit dem anderen übereinstimmt
		System.out.println(b2);
		
		
		boolean b3 = true != false;
		System.out.println(b3);
		
		boolean b4 = "Hallo" == "Ciao";
		System.out.println(b4);

		Auto a4 = new Auto (100, "BMW");
		Auto a5 = new Auto(100, "BMW");
		System.out.println(a4 == a5);   // Wieso kommt hier false raus => Wir erstellen zwei neue Auto mit den gleichen Eigenschaften jedoch sind die Objekte in anderen Referenzen gespeichert, d.h. wir verlgeichen nicht das Objekt selbst sonder die Referenz => Prüfung auf Identität wird hier gemacht !!
	}

}
