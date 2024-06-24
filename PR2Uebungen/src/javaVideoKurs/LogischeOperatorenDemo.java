package javaVideoKurs;

import klassen.Auto;

public class LogischeOperatorenDemo {

	public static void main(String[] args) {

//		Vergleichen Boolsche Werte und geben dann wieder einen Boolean aus !

//		! (Nicht / Boolsche Negation)
		boolean b = true;
		System.out.println(!b); // Ist dann false in der Ausgabe

//		& (Und) => Binärer Operant => Wir brauchen zwei Werte also 

		boolean b2 = true;
		System.out.println(b & b2);

//		| (oder) => Hier ist nicht entweder oder gemeint sondern nur einer muss true sein und das Ergebnis ist true
		System.out.println(b | b2);

//		^ (exklusives Oder) => Einer der beiden Werte muss true sein => Nur wenn die Werte unterschiedlich sind ist es true
		System.out.println(b ^ !b2); // => True
		System.out.println(b ^ b2); // => False

		Auto bmw = new Auto(200, "BMW");
		Auto audi = new Auto(120, "Audi");

		if (Auto.erstellteAutos == 2) {
			if (audi.getLeistung() < 100) {
				;
				audi.tunen();
			} else if (audi.getLeistung() < bmw.getLeistung()) {
				audi.tunen();
			}
		}

//	einfacher

		if (Auto.erstellteAutos == 2 & audi.getLeistung() < 100 | audi.getLeistung() < bmw.getLeistung())

		{
			audi.tunen();
		}

	}
}
