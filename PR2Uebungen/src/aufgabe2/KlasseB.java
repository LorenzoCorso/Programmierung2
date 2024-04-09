package aufgabe2;

public class KlasseB {
	
	private KlasseA a;
	private String sb;

	public KlasseB(KlasseA a) {
		setA(a);
		setSb(a.getSa());
	}

	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb;
	}

	public void setA(KlasseA a) {
		this.a = a;
	}
}