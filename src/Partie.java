public class Partie {
    private Joueur[] joueurs;
    private int nb_tours;
    private Goblet goblet;

    public Partie(int nb_tours, int nb_des) {
        goblet = new Goblet(nb_des);
        this.nb_tours = nb_tours;
        this.joueurs = new Joueur[2];
    }

    public void initialiser() {
        this.joueurs[0] = new Joueur("Joueur 1");
        this.joueurs[1] = new Joueur("Joueur 2");
    }

    public void lancer() {
        for(int i = 0; i<nb_tours; i++) {
            this.joueurs[0].jouer(goblet);
            this.joueurs[1].jouer(goblet);
        }
        String gagnant = this.joueurs[0].get_score() > this.joueurs[1].get_score() ? this.joueurs[0].get_nom() : this.joueurs[1].get_nom();
        System.out.println("Le gagnant de la partie, avec un score de " + gagnant );
    }

    public void afficher_gagnant() {
        String gagnant = this.joueurs[0].get_score() > this.joueurs[1].get_score() ? this.joueurs[0].get_nom() : this.joueurs[1].get_nom();
        int score_gagnant = Math.max(this.joueurs[0].get_score(), this.joueurs[1].get_score());

        System.out.println(joueurs[0].get_nom() + " : " + joueurs[0].get_score());
        System.out.println(joueurs[1].get_nom() + " : " + joueurs[1].get_score());
        System.out.println("le gagnant est " + gagnant + " avec un score de " + score_gagnant);
    }
}
