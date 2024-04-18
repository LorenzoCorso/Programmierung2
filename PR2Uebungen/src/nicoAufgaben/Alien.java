package nicoAufgaben;

class Alien implements Cloneable {
	private String name;
	private Raumanzug raumanzug;

	public Alien(String name, Raumanzug raumanzug) {
		this.name = name;
		this.raumanzug = raumanzug;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Raumanzug getRaumanzug() {
		return raumanzug;
	}

	public void setRaumanzug(Raumanzug raumanzug) {
		this.raumanzug = raumanzug;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Alien clonedAlien = (Alien) super.clone();
		clonedAlien.raumanzug = (Raumanzug) raumanzug.clone();
		return clonedAlien;
	}
}