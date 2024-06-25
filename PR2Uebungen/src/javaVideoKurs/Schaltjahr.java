package javaVideoKurs;

public class Schaltjahr {
	public static void main(String[] args) {
		int jahr = 1404;

		boolean schaltjahr = (jahr % 4 == 0 && (jahr % 400 == 0 || jahr % 100 != 0));

		System.out.println("Das Jahr " + jahr + " ist " + (!schaltjahr ? "k" : "") + "ein Schaltjahr");
	}
}