package fr.romgrm;

import java.util.Scanner;

public class Game {
    
    Planche planche; 
    Player player; 
    Player joueur_1 = new Player("Joueur 1", 'X'); 
    Player joueur_2 = new Player("Joueur 2", 'O');
    Planche plancheDeJeu = new Planche();
    
    public void newGame(){

        

        System.out.println("Commençons une partie de Morpion !");

        // je veux afficher la planche de morpion
        // je dois donc créer une class planche de jeu et l'afficher ici

         

        System.out.println("\n" + "Voici la planche de jeu");

        plancheDeJeu.display();

        System.out.println("\n" + "Joueur 1 , tu auras le symbole : X" + "\n" + "C'est à ton tour de joueur, choisit une coordonnée : ");
        
    }

    public void play(){
        // Scanner scan = new Scanner(System.in);
        // int entreeRow = scan.nextInt();
        // System.out.println("Maintenant, entre un nombre pour choisir la colonne : ");
        // int entreeColumn = scan.nextInt();    
        System.out.println(this.joueur_2.symbolJoueur);
        //this.plancheDeJeu.fill(this.player.symbolJoueur , entreeRow, entreeColumn);
        this.plancheDeJeu.display();
            
    }
}