package javaVideoKurs;

public class KundeAufgabe3Uebungsblock3 {

	private static int idCounter = 1;
	private final int id;

	{
		id = idCounter;
		idCounter = idCounter + 1;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {

		KundeAufgabe3Uebungsblock3 kunde1 = new KundeAufgabe3Uebungsblock3();
		KundeAufgabe3Uebungsblock3 kunde2 = new KundeAufgabe3Uebungsblock3();

		System.out.println(kunde1.getId());
		System.out.println(kunde2.getId());
	}

}
