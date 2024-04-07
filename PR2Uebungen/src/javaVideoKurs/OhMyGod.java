package javaVideoKurs;

public class OhMyGod {

	public static void main(String[] args) {

		int a = 1;
		System.out.println(a);
		int b = a + ++a;
		System.out.println(b);
		int c = b++ - a + a--;
		System.out.println(c);

		System.out.println(c++ + a++);
		System.out.println(--b - (-++c));
		System.out.println(a - c);
	}

}
