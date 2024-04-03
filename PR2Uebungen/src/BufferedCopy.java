
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopy {

	public static void main(String[] args) {

		try (BufferedReader bf = new BufferedReader(new FileReader("eineDatei.txt"));
				BufferedWriter eineEingabeDatei = new BufferedWriter(new FileWriter("eineDatei2.txt")))

		{		
			
			String zeile;
			while ((zeile = bf.readLine()) != null) {			
				eineEingabeDatei.write(zeile);
			}
			
			bf.close();
			eineEingabeDatei.close();

		} catch (IOException eineAusnahme) {
			System.out.println("Fehlermeldung: " + eineAusnahme);
		}	
	}
}
