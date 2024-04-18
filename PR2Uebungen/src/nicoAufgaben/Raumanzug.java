package nicoAufgaben;

public class Raumanzug implements Cloneable {
    private String typ;

    public Raumanzug(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}




