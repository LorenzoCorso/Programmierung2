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

	private void druckeWert() {
		System.out.println("WERT: " + wert);
	}

	public static void main(String[] args) {

		new QuickCalc(10).plus(3).minus(2).invertiere().plus(1).minus(7).invertiere().plus(13);

	}

}
