public abstract class Kreatur extends Objekt {

    int hp;
    Waffe waffe;

    public Kreatur(String pRepresentation) {
        super(pRepresentation);
    }

    public Waffe getWaffe() {
        return this.waffe;
    }
}
