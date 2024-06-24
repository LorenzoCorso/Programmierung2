package javaVideoKurs;

public class Class {

	public static void main(String[] args) {
		
		int i = 9;
		int k = 2;
		boolean b = (i < 10 & modCheck(k) || modCheck(++i));
		if (b) {
			System.out.println("<");
		} else {
			System.out.println(">");
		}
		System.out.println(i);
	}

	public static boolean modCheck(int x) {
		System.out.println(x);
		return x % 2 == 0;

	}
}
