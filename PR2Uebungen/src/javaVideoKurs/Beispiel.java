package javaVideoKurs;

public class Beispiel {
	
	String name1;
	
	public void begrüßeBenutzer( String name) {
		this.name1 = name;
		System.out.println("Hallo " + name + " !");
	}

	public static void main(String[] args) {
		
		Beispiel bsp = new Beispiel();
		
		bsp.begrüßeBenutzer("Max");
		System.out.println(bsp.name1);
	
	}

}
