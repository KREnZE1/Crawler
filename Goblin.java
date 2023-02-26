public class Goblin extends Monster{
    static final Waffe schwert = new Waffe(4, 1);
    static final String REPRESENTATION = "G";

    public Goblin() {
        super(REPRESENTATION);
    }

}

/**
 * Ein bestimmtes Monster
 * Goblins sind Nahkämpfer und benutzen Schwerter.
 * Sie haben viele Leben und machen viel Schaden.
 */