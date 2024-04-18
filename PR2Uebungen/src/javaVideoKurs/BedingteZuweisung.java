package javaVideoKurs;

public class BedingteZuweisung {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String s;
		int j = 10;

		if (j % 2 == 0) {
			s = "Zahl gerade";
		} else {
			s = "Zahl ungerade";
		}

		// Konditionaloperator

		s = j % 2 == 0 ? "Zahl gerade" : "Zahl ungerade";
		s = j % 2 == 0 ? j == 0 ? "Die Zahl ist eine Null" : "Zahl gerade" : "Zahl ungerade";
		
	}

}
