package javaVideoKurs;

class Auto {

	private String hersteller;
	private int leistung;

	public int getLeistung() {
		return leistung;
	}

	private void setLeistung(int neueLeistung) {
		leistung = neueLeistung;
	}

	public String getHersteller() {
		return hersteller;
	}

	private void setHersteller(String neuerHersteller) {
		hersteller = neuerHersteller;
	}

	public void tunen(int tuneWert) {
		leistung = leistung + tuneWert;

	}

	public Auto(int dieLeistung, String derHersteller) {
		setLeistung(dieLeistung);
		setHersteller(derHersteller);

	}

	public static void printInfos(Auto auto) {
		System.out.println("Die Leistung ist: " + auto.leistung + " der Hersteller ist " + auto.hersteller);
		

	}

}
