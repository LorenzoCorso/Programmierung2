package javaVideoKurs;

public class Class {
	private int x;
	private String y;
	private static int z;

	public Class(int x, String y, int z) {
		x = z;
		this.y = y;
		Class.z = z + x;
	}

	public int getX() {
		return x;
	}

	public String getY() {
		return y;
	}

	public static int getZ() {
		return z;
	}
}
