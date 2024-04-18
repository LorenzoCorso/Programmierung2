package nicoAufgaben;

import java.text.DecimalFormat;

public class DoubleFormatter {
    public static void printDouble(double number, int decimalPlaces) {
    	
        // Erstelle einen DecimalFormat-Objekt mit der gewünschten Anzahl von Nachkommastellen
    	
        DecimalFormat df = new DecimalFormat("#." + "0".repeat(decimalPlaces));
        
        // Runde die Dezimalzahl auf die gewünschte Anzahl von Nachkommastellen
        
        String roundedNumber = df.format(number);
        
        // Gib die gerundete Zahl aus
        
        System.out.println(roundedNumber);
    }

    public static void main(String[] args) {
        double number = 3.14592653589793238;
        int decimalPlaces = 2;
        printDouble(number, decimalPlaces); 
    }
}
