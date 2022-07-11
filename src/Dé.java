import java.util.Random;

public class Dé {
    private int valeur;

    public Dé() {
        this.valeur=0;
    }

    public int get_Valeur() {
        return this.valeur;
    }

    public void lancer() {
        Random r = new Random();
        this.valeur = r.nextInt(6) + 1;

    }
}
