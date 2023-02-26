public class Object {
    String representation;
    public Object(String pRepresentation) {
        this.representation = pRepresentation;
    }

    @Override
    public String toString() {return this.representation;}
}
