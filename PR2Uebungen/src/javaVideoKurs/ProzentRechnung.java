package javaVideoKurs;

public class ProzentRechnung {
	
	private double richtGroesse;
	
	
	public ProzentRechnung(int richtGroesse) {
		
		this.richtGroesse = richtGroesse;
	}

	public double prozentZuWert(int prozent) {
		return (richtGroesse * prozent) / 100;

	}
	
	public double wertZuProzent(int wert) {
		return (wert / richtGroesse) * 100;
		
		

	}
	public static void main(String[] args) {

		ProzentRechnung pr = new ProzentRechnung(500);
		System.out.println(pr.wertZuProzent(1000));
		System.out.println(pr.wertZuProzent(23));
		System.out.println(pr.prozentZuWert(50));
		System.out.println(pr.prozentZuWert(1));

	}

	
	

	
}
