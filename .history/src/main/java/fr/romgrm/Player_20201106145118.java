package fr.romgrm;

public class Player {
    public String nomDuJoueur; 
    public char symbolJoueur;
     

    public Player(String nomDuJoueur,char symbolJoueur) {
        this.nomDuJoueur = nomDuJoueur;
        this.symbolJoueur = symbolJoueur;
    }

    public String getNomDuJoueur() {
        return nomDuJoueur;
    }

    public void setNomDuJoueur(String nomDuJoueur) {
        this.nomDuJoueur = nomDuJoueur;
    }

    public char getSymbolJoueur() {
        return symbolJoueur;
    }

    public void setSymbolJoueur(char symbolJoueur) {
        this.symbolJoueur = symbolJoueur;
    }

    // Player joueur_1 = new Player("Joueur 1", 'X'); 
    // Player joueur_2 = new Player("Joueur 2", 'O'); 
    
    public boolean win(char[][] planche){
        if(planche[0][0] == 'X' && planche[0][1] == 'X' && planche[0][2] == 'X'){
             return true;  
        }else{
            return false; 
        }
    }
}

