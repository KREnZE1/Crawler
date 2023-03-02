import java.util.Arrays;

public class Raum {

    Objekt[][] karte = new Objekt[5][5];

    public Raum() {
        karte = new Objekt[5][5];
        befuellen();
    }

    private void befuellen() {
        karte[4][2] = new Spieler();
        karte[1][0] = new Skelett();
        karte[3][3] = new Goblin();
        karte[4][4] = new Waffe(3, 2);

        auffuellen();
    }

    private void auffuellen() {
        for (int i = 0; i < karte.length; i++) {
            for (int j = 0; j < karte[i].length; j++) {
                if (karte[i][j] == null)
                    karte[i][j] = new Objekt(" ");
            }
        }
    }

    public void ausgeben() {
        for (Objekt[] arr : karte)
            System.out.println(Arrays.toString(arr));
    }

    public int berechneDistanz(Punkt pA, Punkt pB) {
        int xDif = Math.abs(pA.getX()-pB.getX());
        int yDif = Math.abs(pA.getY()-pB.getY());
        return (xDif+yDif);
    }

    public Punkt findeObjekt(Object o) {
        for (int i=0; i<karte.length; i++) {
            for (int j=0; j<karte[i].length; j++) {
                if (karte[i][j].equals(o)) return new Punkt(i, j);
            }
        }
        return null; //Wenn das Objekt nicht gefunden wird wird null zurückgegeben
    }
}
