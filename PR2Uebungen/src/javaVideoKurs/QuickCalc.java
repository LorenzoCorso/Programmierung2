package javaVideoKurs;

public class QuickCalc {

	private int wert;

	public QuickCalc(int initialWert) {
		wert = initialWert;
		druckeWert();
	}

	public QuickCalc plus(int x) {
		System.out.println("+ " + x);
		wert = wert + x;
		druckeWert();
		return this;
	}

	public QuickCalc minus(int x) {
		System.out.println("- " + x);
		wert = wert - x;
		druckeWert();
		return this;
	}

	public QuickCalc invertiere() {
		System.out.println("<invertiere>");
		wert = wert * -1;
		druckeWert();
		return this;
	}

	public QuickCalc plus(QuickCalc q) {
		return plus(q.wert);
	}

	public QuickCalc minus(QuickCalc q) {
		return minus(q.wert);
	}

	private void druckeWert() {
		System.out.println("WERT: " + wert);
	}

	public static void main(String[] args) {

		System.out.println("QuickCalc 1: ");
		QuickCalc q1 = new QuickCalc(-9).plus(3).minus(1).invertiere().plus(3);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("QuickCalc 2: ");
		QuickCalc q2 = new QuickCalc(5).invertiere().plus(11).minus(5);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("QuickCalc 3: ");
		new QuickCalc(5).plus(q1).minus(2).minus(q2).plus(q2.invertiere());

	}

}
