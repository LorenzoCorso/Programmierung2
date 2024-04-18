package nicoAufgaben;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Raumanzug raumanzug = new Raumanzug("Typ A");
		Alien alien1 = new Alien("Alien1", raumanzug);

		// Clone des Alien-Objekts erstellen
		Alien alien2 = (Alien) alien1.clone();

		// Überprüfen, ob die Objekte unterschiedliche Referenzen haben
		System.out.println("Alien 1: " + alien1);
		System.out.println("Alien 2: " + alien2);
		System.out.println("Sind die Aliens gleich: " + (alien1 == alien2));

		// Überprüfen, ob die Raumanzüge unterschiedliche Referenzen haben
		System.out.println("Raumanzug von Alien 1: " + alien1.getRaumanzug());
		System.out.println("Raumanzug von Alien 2: " + alien2.getRaumanzug());
		System.out.println("Sind die Raumanzüge gleich: " + (alien1.getRaumanzug() == alien2.getRaumanzug()));
	}
}