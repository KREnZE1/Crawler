public class Skelett extends Monster{
    static final Waffe BOGEN = new Waffe(1, 3);
    static final String REPRESENTATION = "S";

    public Skelett() {
        super(REPRESENTATION);
        this.waffe = BOGEN;
    }

}

/**
 * Ein bestimmtes Monster
 * Skelette sind Fernkämpfer und benutzen Bögen.
 * Sie haben wenig Leben und machen nicht viel Schaden.
 */