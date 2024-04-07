package javaVideoKurs;

public class OperatorenDemo {

	public static void main(String[] args) {

		
		//Arithmetische Operatoren 
		System.out.println("Konkatination " + 5 +5.5); // Hier wird nicht mehr gerechnet da hier alle als Zeichenkette interpretiert wird
		System.out.println( 5 +5.5 +" keine Konkatination"); // Option 1 damit noch gerechnet wird 
		System.out.println((5+5.5) + (" Konkatination"));  // Option 2 
		
		int i = 10;
		int i2 = -10;  // Vorzeichen gesetzt
		
		
		System.out.println(-25 - 50); // Subtraktion in der negativen 
		
		System.out.println(5 * 5); // Multiplikation
		
		System.out.println(1 / 2); // Division => es kommen hier nur ganze Zahlen raus da alle Nachkommastellen abgeschnitten werden => 0 ist hier das Ergebnis
		System.out.println(1.0 / 2.0); // Hier ist das Ergebnis 0.5 da wird mit Gleitkommazahlen rechnen
		
		System.out.println( 11 % 5); // Modulo => gibt nur den Rest an => wird meist verwendet um zu schauen ob eine Zahl gerade ist oder nicht
		
		
		
		System.out.println(5+5 * 2 ); // Beispiel für Punkt vor Strich
		System.out.println((5+5)*2); // Beispiel für Klammer vor Punkt
		
		// Inkrement (++) und Dekrement (--)
		
		int a = 5; 
		a++;     // ist das selbe wie a = a + 1;
		System.out.println(a);
		
		int b = 4;
		b--;	// ist das selbe wie b = b - 1;
		System.out.println(b);
		
		int x = 10;
		int y = 10;
		System.out.println(x++);    // gibt 10 als Wert aus da hier nie nochmal Sysout(x) vorkommt um die erhöhte Version abzufragen
		System.out.println(++y);    // gibt 11 als Wert aus da hier vor der Ausgabe druch Sysout inkrementiert wurde
		
		
	}

}
