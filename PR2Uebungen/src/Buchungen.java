import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buchungen {

    public static void main(String[] args) {

        double sumLessThan1000 = 0;
        double sumGreaterThan1000 = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("buchungen.text"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 4) {
                    String betragStr = parts[3].trim();
                    try {
                        double buchungsbetrag = Double.parseDouble(betragStr);

                        if (buchungsbetrag < 1000) {
                            sumLessThan1000 += buchungsbetrag;
                            System.out.println(line);
                        } else {
                            sumGreaterThan1000 += buchungsbetrag;
                            System.err.println(line);
                        }
                    } catch (NumberFormatException e) {
                        // Wenn der Buchungsbetrag keine Zahl ist, wird er als Zeichenfolge behandelt und ignoriert
                        System.err.println("Ungültiger Betrag: " + betragStr);
                    }
                } else {
                    System.err.println("Ungültige Zeile: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Kumulierter Betrag für Buchungen < 1000 Euro: " + sumLessThan1000 + " Euro");
        System.out.println("Kumulierter Betrag für Buchungen >= 1000 Euro: " + sumGreaterThan1000 + " Euro");
    }
}
