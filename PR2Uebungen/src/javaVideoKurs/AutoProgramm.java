package javaVideoKurs;

import klassen.Auto;
public class AutoProgramm {

	public static void main(String[] args) {
		
		System.out.println("Das Programm ist gestartet...");
			
		Auto bmw = new Auto ("BMW");
		Auto audi = new Auto ("Audi");
		
		bmw.tunen();
		audi.tunen();
		
		Auto.printInfos(bmw);
		Auto.printInfos(audi);
		
//		System.out.println(bmw.getHersteller() + " " + bmw.getLeistung());
//		System.out.println(audi.getLeistung());
//		System.out.println(audi.getHersteller() + " "+ audi.getLeistung());
	}
 	

}
