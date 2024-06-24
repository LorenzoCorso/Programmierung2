package klassen;

public class Auto {
	
	public static final int DEFAULT_TUNEWERT = 50;
	
	public static int erstellteAutos = 0;
	
	static {
		System.out.println("Die Auto-Klasse wurde initialisiert");
	}
	
//	Instanz-Variablen (Attribute, Member)
//	<Datentyp> <name> [<Zuweisung>];
	private int leistung;
	private final String hersteller;
	
//	Instanz-Methoden 
//	<Rückgabedatentyp> <name> ([<Parameterliste>)] {Rumpf (Logik)}
	public void tunen (int tuneWert) {
		/*
		 * TODO 
		 * Wir müssen noch den Wert tuneWert überprüfen !
		 * Falls er negativ ist -> Reagiere darauf !
		 */
		
		leistung += tuneWert;
	}
	
	public void tunen() {
		tunen(DEFAULT_TUNEWERT);
	}
	
//	Getter
	public int getLeistung() {
		return leistung;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
//	Setter
	private void setLeistung (int leistung) {
		/*
		 * TODO
		 * Wir müssen noch den Wert der Leistung überprüfen
		 * Falls er negativ ist -> Reagiere darauf !
		 */
		this.leistung = leistung;
	}
	
//	Konstruktoren
//	<KlassenName> (<Parameterliste>) { Rumpf (Logik) }
	public Auto (int leistung, String hersteller) {
		this.hersteller = hersteller;
		setLeistung(leistung);
		erstellteAutos = erstellteAutos +1;
		System.out.println("Es wurde soeben das " + erstellteAutos + ". Auto erstellt");
	}
	
	public Auto (String hersteller) {
		this(100, hersteller);
	}
	
	public static void printInfos (Auto auto) {
		System.out.println("Die Leistung ist: " + auto.leistung +  " der Hersteller lautet: "+ auto.hersteller );
	}
	

}
