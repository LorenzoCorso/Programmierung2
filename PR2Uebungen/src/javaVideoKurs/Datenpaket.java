package javaVideoKurs;

public class Datenpaket {
	private final int a;
	private final int b;
	private final int c;
	private final int d;
	private final int e;
	private final int f;

	public Datenpaket(int a, int b, int c, int d, int e, int f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public Datenpaket(int a, int b, int c, int d, int e) {
		this(a, b, c, d, e, e + 1);
	}

	public Datenpaket(int a, int b, int c, int d) {
		this(a, b, c, d, d + 1);
	}

	public Datenpaket(int a, int b, int c) {
		this(a, b, c, c + 1);
	}

	public Datenpaket(int a, int b) {
		this(a, b, b + 1);
	}

	public Datenpaket(int a) {
		this(a, a + 1);
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public int getD() {
		return d;
	}

	public int getE() {
		return e;
	}

	public int getF() {
		return f;
	}

	public static void main(String[] args) {
		Datenpaket daten = new Datenpaket(5, 10, 40);
		System.out.println(daten.getA()); // Ausgabe: 5
		System.out.println(daten.getB()); // Ausgabe: 10
		System.out.println(daten.getC()); // Ausgabe: 40
		System.out.println(daten.getD()); // Ausgabe: 41
		System.out.println(daten.getE()); // Ausgabe: 42
		System.out.println(daten.getF()); // Ausgabe: 43
	}
}
