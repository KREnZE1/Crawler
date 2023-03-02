public class Goblin extends Monster{
    static final Waffe SCHWERT = new Waffe(4, 1);
    static final String REPRESENTATION = "G";

    public Goblin() {
        super(REPRESENTATION);
        this.waffe = SCHWERT;
    }

}

/**
 * Ein bestimmtes Monster
 * Goblins sind Nahkämpfer und benutzen Schwerter.
 * Sie haben viele Leben und machen viel Schaden.
 */