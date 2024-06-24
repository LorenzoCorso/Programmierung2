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

		
		if (audi != null) {
		if (Auto.erstellteAutos == 2) {
			if (audi.getLeistung() < 100) {
				;
				audi.tunen();
			} else if (audi.getLeistung() < bmw.getLeistung()) {
				audi.tunen();
			}
		}
		}

//	einfacher

		if (audi != null && Auto.erstellteAutos == 2 & audi.getLeistung() < 100 | audi.getLeistung() < bmw.getLeistung())

		{
			audi.tunen();
		}

//		Short Circuit Evaluation / Kurzschlussauswertung =>  && und || => werden nur solange ausgewertet solange auch kein Ergebnis vorliegt

		int i = 10;
		int j = 15;
		if (i == 10 || j == 15) {  // d.h bei einem | wertet er beide Variablen aus und schaut ob erst die i = true ist und dananch wird noch, 
			//  					  auch wenn überflüssig j = 15 ausgewertet. Bei || bricht er sofort ab nachdem i = true ist weil dann der Ausdruck auch schon true ist da 
			//				 	    => bei oder nur ein true notwendig ist !!
			
			//  Das gleiche gilt auch für && sobald einer der beiden Varibalen den Wert false liefert zbsp i = false dann wird j nicht mehr überprüft da bei & beide Variablen true liefern müssen
			// ....
			return;
		}

	}

}
