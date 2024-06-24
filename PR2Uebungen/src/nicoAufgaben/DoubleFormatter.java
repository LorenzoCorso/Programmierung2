package nicoAufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DoubleFormatter {
	public static void printDouble(double number, int decimalPlaces) {
    	
        // Erstelle einen DecimalFormat-Objekt mit der gewünschten Anzahl von Nachkommastellen
    	
        DecimalFormat df = new DecimalFormat("#." + "0".repeat(decimalPlaces));  // #.0000000
        
        // Runde die Dezimalzahl auf die gewünschte Anzahl von Nachkommastellen
        
       String roundedNumber = df.format(number); // Methode format wandelt 
        
        // Gib die gerundete Zahl aus
        
        System.out.println(roundedNumber);
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	double number;
        int decimalPlaces;
        
        System.out.println("Geben Sie eine Zahl welche Runden wollen");
        number = sc.nextDouble();
        System.out.println("Geben Sie die gewünschte Anzhal von Nachkommastellen ein");
        decimalPlaces = sc.nextInt();
        printDouble(number, decimalPlaces); 
        sc.close();
    }
}
