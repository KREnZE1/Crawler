public class Objekt {
    String representation;

    public Objekt(String pRepresentation) {
        this.representation = pRepresentation;
    }

    @Override
    public String toString() {
        return this.representation;
    }
}
