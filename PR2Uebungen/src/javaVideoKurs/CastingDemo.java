package javaVideoKurs;

public class CastingDemo {

	public static void main(String[] args) {
		
		// Implizieter Cast 
		
		
		long l = 50; 
		double d = 2; // Wieso sind beide jetzt gecasted ? => Ganze Zahlen werden normalerweise immer als Integer interpretiert = Casting in anderen Datentyp welchen 
					  // festgelegt hatten
		
		
//		expliziter Cast
		
		int i = 10; 
		byte b = (byte)i;
		System.out.println(b);
		
//		Fehler können hier leicht passieren 
		
		double dou = 2.45;
		int in = (int)dou;  // Ergebnis ist dann nicht mehr 2.45 sondern 2 da Nachkommastellen hier abgeschnitten werden !
		
		
		System.out.println(Long.MAX_VALUE);
		
	}

}
