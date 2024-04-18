package javaVideoKurs;

public class BedingteAnweisung {

	public static void main(String[] args) {

		int i = 10;
		int j = 25;

		if (i > 0) {
			if (j == 25) {
				System.out.println("i ist positiv und j ist 25");
			}
			else {
				System.out.println("i ist positiv und j ist NICHT 25");
			}
		} else if (i == 0) {
			System.out.println("i ist null");
		} else {
			System.out.println("i ist negativ");
		}
	}

}
