package javaVideoKurs;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bitte geben Sie eine Jahreszahl ein");
		
		int jahr = sc.nextInt(); 
		boolean istSchaltjahr = (jahr % 4 == 0) && (jahr % 100 != 0) || (jahr % 400 == 0);

		if (istSchaltjahr) {
			System.out.println(jahr + " ist ein Schaltjahr.");
		} else {
			System.out.println(jahr + " ist kein Schaltjahr.");
			
		
		}
		sc.close();
	}
}
