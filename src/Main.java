public class Main {
    public static void main(String[] args) {
        Partie maPartie = new Partie(6, 3); // 6 tours avec 3 dés
        maPartie.initialiser();
        maPartie.lancer();
        maPartie.afficher_gagnant();
    }
}
