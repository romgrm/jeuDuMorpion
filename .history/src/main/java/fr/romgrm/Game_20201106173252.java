package fr.romgrm;

import java.util.Scanner;

public class Game {
    
    Planche planche; // J'apelle ma class Planche pour avoir une vue dessus  
    Player joueur_1 = new Player("Joueur 1", 'X'); // je créer l'instance de mon joueur 1 
    Player joueur_2 = new Player("Joueur 2", 'O'); // je créer l'instance de mon joueur 2
    Planche plancheDeJeu = new Planche(); // je créer l'instance de ma grille de morpion
    
    
    /****************************************************** CREATION DE LA PARTIE ***************************************************************/
    public void newGame(){

        

        System.out.println("Commençons une partie de Morpion !");

        // je veux afficher la planche de morpion
        // je dois donc créer une class planche de jeu et l'afficher ici

         

        System.out.println("\n" + "Voici la planche de jeu");

        plancheDeJeu.display();

        System.out.println("\n" + this.joueur_1.getNomDuJoueur() + " tu auras le symbole : " + this.joueur_1.getSymbolJoueur() + "\n" + "Quant à toi " + this.joueur_2.getNomDuJoueur() + " tu auras le symbole : " + this.joueur_2.getSymbolJoueur());
        
    }
    /**************************************************************************************************************************************************/


    /*************************************** LANCEMENT DE LA PARTIE ************************************************/
    public void play(){
        
       
        /* Tour du Joueur_1 */    
        System.out.println("C'est à ton tour" + this.joueur_1.getNomDuJoueur() + " , entre un nombre pour choisir une ligne : ");
        Scanner scan = new Scanner(System.in);
        int entreeRow = scan.nextInt();
        System.out.println("Maintenant, entre un nombre pour choisir la colonne : ");
        int entreeColumn = scan.nextInt();    
        /***************************************/


        /* Envoie des données à notre instance de grille de morpion */
        this.plancheDeJeu.fill(this.joueur_1.symbolJoueur , entreeRow, entreeColumn);
        this.plancheDeJeu.display();
        /***************************************/


        /* Tour du Joueur_2 */ 
        System.out.println("C'est à ton tour joueur 2, entre un nombre pour choisir une ligne : ");
        Scanner scan2 = new Scanner(System.in);
        int entreeRow2 = scan.nextInt();
        System.out.println("Maintenant, entre un nombre pour choisir la colonne : ");
        int entreeColumn2 = scan.nextInt();

        /* Envoie des données à notre instance de grille de morpion */
        this.plancheDeJeu.fill(this.joueur_2.symbolJoueur , entreeRow2, entreeColumn2);
        this.plancheDeJeu.display();
        /***************************************/
        
         /* Boucle pour continuer de joueur tant que la partie n'est pas gagnée */ 
         while (joueur_1.win(this.plancheDeJeu.grilleDeMorpion) != true) {
        
            /* Condition a chq tour pour voir si un joueur a gagné */ 
       if(joueur_1.win(this.plancheDeJeu.grilleDeMorpion) == true){
           System.out.println(this.joueur_1.getNomDuJoueur() + " a gagné la partie !");
       }else if(joueur_2.win(this.plancheDeJeu.grilleDeMorpion) == true){
           System.out.println(this.joueur_2.getNomDuJoueur() + " a gagné la partie !");
       }
       }
           
    }
    /*****************************************************************************************************************/

    

    
}