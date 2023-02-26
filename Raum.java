import java.util.Arrays;

public class Raum {

    Object[][] karte;

    public Raum() {
        karte = new Object[5][5];
        befuellen();
    }

    private void befuellen() {
        karte[4][2] = new Spieler();
        karte[1][0] = new Skelett();
        karte[3][3] = new Goblin();
        karte[4][4] = new Waffe(3,2);

        auffuellen();
    }

    private void auffuellen() {
        for (int i=0; i<karte.length; i++) {
            for (int j=0; j<karte[i].length; j++) {
                if (karte[i][j] == null) karte[i][j] = new Object(" ");
            }
        }
    }

    public void ausgeben() {
        for (Object[] arr : karte) System.out.println(Arrays.toString(arr));
    }
}
