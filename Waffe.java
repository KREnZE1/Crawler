public class Waffe extends Item{

    private int schaden, reichweite;

    public Waffe(int pSchaden, int pReichweite) {
        this.schaden = pSchaden;
        this.reichweite = pReichweite;
    }

    public int getReichweite() {return this.reichweite;}
    public int getSchaden() {return this.schaden;}
}
