package nicoAufgaben;

import java.io.*;

public class BufferedReaderAufgabe3 {
	public static void main(String[] args) {

		// Datei schreiben

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("Mondnacht.txt"))) {
			writer.write("Das ist ein Test");
		} catch (IOException e) {
			System.err.println("Fehler beim Schreiben der Datei: " + e.getMessage());
		}

		// Datei lesen und Zeilen ausgeben

		try (BufferedReader reader = new BufferedReader(new FileReader("Mondnacht.txt"))) {
			String line;
			int lineNumber = 1;
			int totalWords = 0;
			int totalLetters = 0;

			while ((line = reader.readLine()) != null) {
				System.out.println(lineNumber + ": " + line);

				String[] words = line.split("\\s+"); // => "\\s" entspricht einem Leerzeichen , "+" zeigt das
														// dass vorherige Leerzeichen ein oder mehrmals vorkommen kann
														// => zsm. jede Sequenz von aufeinanderfolgenden Leerzeichen
														// wird als Trennzeichen verwendet um eine Zeichenkette zu
														// splitten.
				totalWords += words.length;
				totalLetters = totalLetters + line.length() - words.length + 1; // Leerzeichen nicht mitzählen

				lineNumber++;
			}

			System.out.println("\nGesamt:");
			System.out.println("Zeilen: " + (lineNumber - 1));
			System.out.println("Wörter: " + totalWords);
			System.out.println("Buchstaben: " + totalLetters);
		} catch (IOException e) {
			System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
		}
	}
}
