public class Spieler extends Kreatur{
    static final String REPRESENTATION = "P";

    Waffe waffe;

    public Spieler() {
        super(REPRESENTATION);
    }

    public void setWaffe(Waffe w) {this.waffe = w;}
}