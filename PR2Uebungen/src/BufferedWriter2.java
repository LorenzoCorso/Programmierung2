
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter2 {
	
	public static void main (String [] args) {
		
		try (BufferedWriter eineEingabeDatei = new BufferedWriter(new FileWriter("eineDatei.txt", true))) {  // true setzt append auf true somit wird die Datei erweitert und nicht immer wieder neu überschrieben
			
			
			eineEingabeDatei.write("Hallo das ist ein Test");
		}
		
		catch(IOException eineAusnahme) {
			System.out.println("Fehlermeldung: " + eineAusnahme);
			
			}
	}

}
