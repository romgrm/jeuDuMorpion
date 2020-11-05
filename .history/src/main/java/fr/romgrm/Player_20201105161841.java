package fr.romgrm;

public class Player {
    private String nomDuJoueur; 
    private char symbolJoueur;

    public Player(String nomDuJoueur, char symbolJoueur) {
        this.nomDuJoueur = nomDuJoueur;
        this.symbolJoueur = symbolJoueur;
    }

    Player joueur_1 = new Player("Joueur 1", 'X'); 
    Player joueur_2 = new Player("Joueur 2", 'O'); 
    
}

