package javaVideoKurs;

import java.awt.Color;

public class FarbAufgabe {

	public static void main(String[] args) {
		
		Color gelb = Color.yellow;
		
//		int rot = gelb.getRed();
//		int blau = gelb.getBlue();                                   => Andere Vorangehensweie
//		int gruen = gelb.getGreen();	
//		System.out.println("Die Farbe Gelb hat den RGB Wert: " + rot + ", " + gruen +", " + blau); 
		System.out.println("Die Farbe Gelb hat den ARBG Wert: " +  gelb);
	
		
		Color dunkel = gelb.darker();
		
		System.out.println("Die Gelb in dunkler hat den ARBG Wert: " + dunkel);
	
	}


		
	}

////Dunklere Farbe erhalten
//Color dunkleresGelb = makeColorDarker(gelb, 50); // z.B. um 50 dunkler machen
//
//// Ausgabe der dunkleren Farbe
//System.out.println("Dunklere Farbe: " + dunkleresGelb);
//}
//
//// Methode zur Erzeugung einer dunkleren Farbe
//public static Color makeColorDarker(Color farbe, int dunklerFaktor) {                => Andere Option so ist die Farbe um einen selber festgelegten Wert dunkler gemacht worden.
//int r = Math.max(0, farbe.getRed() - dunklerFaktor);
//int g = Math.max(0, farbe.getGreen() - dunklerFaktor);
//int b = Math.max(0, farbe.getBlue() - dunklerFaktor);
//return new Color(r, g, b);
//}
//}