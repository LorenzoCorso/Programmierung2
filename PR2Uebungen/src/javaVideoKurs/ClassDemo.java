package javaVideoKurs;

public class ClassDemo {
	
	public static void main(String[] args) {
		Class c1 = new Class(5, "10", 15);
		Class c2 = new Class(1, "2", 3);
		System.out.println(c1.getX() + c2.getX());
		System.out.println(c1.getY() + c2.getY());
		System.out.println(c1.getZ() + c2.getZ());
	}
}