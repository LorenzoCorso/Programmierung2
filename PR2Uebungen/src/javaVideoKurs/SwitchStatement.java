package javaVideoKurs;

import java.util.Scanner;

public class SwitchStatement {
	
	public static final int STATUS_BEREIT = 1;
	public static final int STATUS_WAEHLE_SORTE = 2;
	public static final int STATUS_ASUGEBEN = 3;
	public static final int STATUS_LEER = 4;

	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine Zahl ein um einen Case auszuwählen");
		Scanner sc = new Scanner(System.in);
		
		// Bietet eine kompaktere Kontrollstruktur als wie es mit if/else möglich wäre => sind auch komplexer also können mehrere Fälle abarbeiten
		
		/*
		 * 
		 * 1 = Bereit zum Kauf eines Kaugummis
		 * 2 = Geld wurde eingworfen
		 * 3 = Kaugummi wird ausgegeben
		 * 4 = Automat leer 
		 * 5 = Systemfehler
		 * 
		 */
		int status = sc.nextInt();
		
		switch (status) {

		case STATUS_BEREIT:
			System.out.println("Bitte werfen Sie geld ein");
			break;
		case STATUS_WAEHLE_SORTE:
			System.out.println("Wählen Sie die Sorte");
			break;
		case STATUS_ASUGEBEN:
			System.out.println("Kaugimi wird ausgegeben -bitte warten...");
			break;
		case STATUS_LEER:
			System.out.println("Automat ist leer");
			break;
		default:
			System.out.println("Systemfehler");
			break;
		}
		
		sc.close();
		
		
	} 

}
