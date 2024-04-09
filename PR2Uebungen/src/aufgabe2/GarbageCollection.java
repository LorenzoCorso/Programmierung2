package aufgabe2;

public class GarbageCollection {
	public static void main(String[] args) {
		
		KlasseA a = new KlasseA(new String("A1"));
// 1
		KlasseB b = new KlasseB(new KlasseA(new String("A2")));
// 2
		a = null;
// 3
		b.setSb("B");
// 4
		b.setA(null);
// 5
	}
} 