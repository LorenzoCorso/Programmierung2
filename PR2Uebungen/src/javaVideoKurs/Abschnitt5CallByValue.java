package javaVideoKurs;

public class Abschnitt5CallByValue {

	public static void main(String[] args) {

		XY xy = new XY();
		initializeXY(xy);
		System.out.println("X = " + xy.x + ", y = " + xy.y);

	}

	private static void initializeXY(XY xy) {
		xy.x = 5;
		xy.y = 8;
	}
}
