package javaVideoKurs;

public class Quersumme {

	public static void main(String[] args) {

		System.out.println(Quersumme.berechneQuersumme(23));
	}

	public static int berechneQuersumme(int zahl) {
		double shift = zahl / 10.0;    // Wenn man eine zweistellige Zahl durch 10 dividiert dann wird die in eine Fließkommazahl geteilt
		System.out.println(shift);     // 23 / 10 = 2.3
		
		int ersteZiffer = (int) shift; // Wir casten die Zahl "shift" (2.3) in einen Integer => d.h dass wir die Nachkommastelle entfernen und nur noch die erste Stelle 
		System.out.println(ersteZiffer);// vorhanden ist.
		
		int zweiteZiffer = zahl - 10 * ersteZiffer; // // Wir nehmen die Zahl 23 - 10 * 2 => 23 - 20 = 3 und so kommen wir auf die zweite Ziffer
		System.out.println(zweiteZiffer);
		
		return ersteZiffer + zweiteZiffer;   // Ziffer 1 + Ziffer 2 = Quersumme
	}

}