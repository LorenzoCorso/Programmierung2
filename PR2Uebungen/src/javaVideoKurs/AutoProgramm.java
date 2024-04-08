package javaVideoKurs;
public class AutoProgramm {

	public static void main(String[] args) {
			
		Auto bmw = new Auto (100, "BMW");
		Auto audi = new Auto (150, "Audi");
		
		bmw.tunen(25);
		audi.tunen(250);
		
		Auto.printInfos(bmw);
		Auto.printInfos(audi);
		
//		System.out.println(bmw.getHersteller() + " " + bmw.getLeistung());
//		System.out.println(audi.getHersteller() + " "+ audi.getLeistung());
	}
 	

}
