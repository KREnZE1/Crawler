public class Main {

    static Raum raum;

    public static void main(String[] args) {
        raum = new Raum();
        raum.ausgeben();
    }

    public void angriff(Kreatur angreifer, Kreatur verteidiger) {
        //Berechne Distanz zwischen angreifer und verteidiger und prüfe, ob distanz klein genug ist
        Punkt pAngreifer = raum.findeObjekt(angreifer);
        Punkt pVerteidiger = raum.findeObjekt(verteidiger);

        int distanz = raum.berechneDistanz(pAngreifer, pVerteidiger);
        if (distanz > angreifer.getWaffe().getReichweite()) {
            //TODO: Abbruch
            System.out.println(angreifer + " kann " + verteidiger + " nicht angreifen, die Distanz ist zu groß");
            return;
        }
        //TODO: Kampfmethode weiterführen
        
    }
}

/**
 * Diese Klasse kümmert sich um die generelle Logik, erzeugt Dungeons und gibt die Räume auf der Konsole aus.
 */