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

    
    /**************************** JOUEUR GAGNANT/PAS GAGNANT ********************************/
    
    public boolean win(char[][] grilleDeMorpion){
        if(grilleDeMorpion[0][0] == 'X' && grilleDeMorpion[0][1] == 'X' && grilleDeMorpion[0][2] == 'X'){
             return true;  
        }else{
            return false; 
        }
    }
    /* Je créer une fonction win() en injectant en paramètre ma grille de morpion.
    Si aux coordonées de mon tableau, j'ai bien un X ou un O, alors je suis gagnant,
    sinon je suis perdant. On créer cette fonction dans la classe joueur vu qu'on veut
    savoir quel joueur est gagnant, et donc pas la créer dans la class Planche car sinon
    ça voudrait juste dire que oui ok la condition est vérifiée, j'ai bien un X a tel 
    coordonnées mais c'est tout, alors que la c'est oui j'ai bien un X a telle coordonées
    donc mon joueur est gagnant  */
    /********************************************************************************************************/
}

