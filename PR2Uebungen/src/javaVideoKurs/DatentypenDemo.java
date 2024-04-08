package javaVideoKurs;

import java.awt.Color;

public class DatentypenDemo {

	public static void main(String[] args) {

		// primitive Datentypen

		int i = 25;
		System.out.println(Integer.MIN_VALUE); // Methode welche den kleinsten möglichen Wert ausgibt welchen man in
												// einem Integer speichern kann
		long l = 500000000000L;
		short s = 50;
		byte b = 20;
		System.out.println(Byte.MAX_VALUE); // => Genau wie oben & geht mit jeden von den Datentypen hier

		float f = 2.5F;
		double d = 2.5345983;

		char c = 'A';

		boolean bool = false;
		
		
//		komplexe Datentype
		
		Auto a = new Auto(0, "Audi");  // Konstruktor - Aufruf
		String st = "Hallo";  // kein Konstruktor/Klasse(Objekt) notwendig 
		Color color = new Color (255,0,0);   //  RBG Farben => hier ROT auf voll

	}

}
