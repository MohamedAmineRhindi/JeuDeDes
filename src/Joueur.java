import org.jetbrains.annotations.NotNull;

public class Joueur {
    private String nom;
    private int score;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    public String get_nom() {
        return this.nom;
    }

    public int get_score() {
        return this.score;
    }

    public void jouer(@NotNull Goblet goblet) {
        goblet.lancer();
        this.score += goblet.get_valeur();
    }

    public void afficher_score() {
        System.out.println("Le score du joueur est " + this.get_score());
    }
}
