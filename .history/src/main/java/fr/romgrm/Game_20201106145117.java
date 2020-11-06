package fr.romgrm;

import java.util.Scanner;

public class Game {
    
    Planche planche;  
    Player joueur_1 = new Player("Joueur 1", 'X'); 
    Player joueur_2 = new Player("Joueur 2", 'O');
    Planche plancheDeJeu = new Planche();
    
    public void newGame(){

        

        System.out.println("Commençons une partie de Morpion !");

        // je veux afficher la planche de morpion
        // je dois donc créer une class planche de jeu et l'afficher ici

         

        System.out.println("\n" + "Voici la planche de jeu");

        plancheDeJeu.display();

        System.out.println("\n" + this.joueur_1.getNomDuJoueur() + " tu auras le symbole : " + this.joueur_1.getSymbolJoueur() + "\n" + "Quant à toi " + this.joueur_2.getNomDuJoueur() + " tu auras le symbole : " + this.joueur_2.getSymbolJoueur());
        
    }

    public void play(){
        while (joueur_1.win(this.plancheDeJeu.grilleDeMorpion) != true) {
            
        System.out.println("C'est à ton tour joueur_1, entre un nombre pour choisir une ligne : ");
        Scanner scan = new Scanner(System.in);
        int entreeRow = scan.nextInt();
        System.out.println("Maintenant, entre un nombre pour choisir la colonne : ");
        int entreeColumn = scan.nextInt();    
        
        
        this.plancheDeJeu.fill(this.joueur_1.symbolJoueur , entreeRow, entreeColumn);
        this.plancheDeJeu.display();

        joueur_1.win(this.plancheDeJeu.grilleDeMorpion);
        }    
    }

    

    
}