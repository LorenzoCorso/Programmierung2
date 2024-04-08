package javaVideoKurs;

public class Abschnitt5CallByValue {

	public static void main(String[] args) {

		XY xy = new XY();    // Lokale Variablen welcher hier zuvor standen => int x = 0; int y = 0; wurden in die Klasse XY verlagert => Objket erstellen in welcher die Daten gekapslet sind 
		initializeXY(xy);    // Aufruf der Methode 
		System.out.println("X = " + xy.x + ", y = " + xy.y);// Übergabe der in der neuen festgelegten Varibalen in der Methode => zeigen nun nicht mehr auf Referzenz von Default (Klasse XY) sondern auf das zugewiesene hier 

	}

	private static void initializeXY(XY xy) { // Wir übergeben das Objekt und ändern die Referenz auf welche die Varibalen innerhalb des Objektes zeigen !
		xy.x = 5;
		xy.y = 8;
	}
}
