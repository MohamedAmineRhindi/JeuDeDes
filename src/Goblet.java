import java.util.Arrays;

public class Goblet {
    private int valeur;
    private Dé[] Des;

    public Goblet(int nb_des) {
        this.valeur = 0;
        this.Des = new Dé[nb_des];
        for(int i = 0; i<nb_des; i++) {
            Des[i] = new Dé();
        }
    }

    public int get_valeur() {
        return this.valeur;
    }

    public void lancer() {
        int S = 0;
        for(int  i = 0; i<this.Des.length; i++) {
            Des[i].lancer();
            S += Des[i].get_Valeur();
        }
        this.valeur = S;
    }

    public void afficher_score(){
        int S = 0;
        for(int  i = 0; i<this.Des.length; i++) {
            S += Des[i].get_Valeur();
        }
        System.out.println("La valeur du goblet est " + S);
    }
}
