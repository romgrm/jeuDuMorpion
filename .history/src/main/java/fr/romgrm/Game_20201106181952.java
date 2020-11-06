package fr.romgrm;

import java.util.Scanner;

public class Game {
    
    Planche planche; // J'apelle ma class Planche pour avoir une vue dessus  
    Player joueur_1 = new Player("Joueur 1", 'X'); // je créer l'instance de mon joueur 1 
    Player joueur_2 = new Player("Joueur 2", 'O'); // je créer l'instance de mon joueur 2
    Planche plancheDeJeu = new Planche(); // je créer l'instance de ma grille de morpion
    
    
    /****************************************************** CREATION DE LA PARTIE ***************************************************************/
    public void newGame(){

        

        System.out.println("\n" + "\n" + "Commençons une partie de Morpion !");

        // je veux afficher la planche de morpion
        // je dois donc créer une class planche de jeu et l'afficher ici

         

        System.out.println("\n"+ "\n" + "Voici la planche de jeu");

        plancheDeJeu.display();

        System.out.println("\n"+ "\n" + this.joueur_1.getNomDuJoueur() + " tu auras le symbole : " + this.joueur_1.getSymbolJoueur() + "\n" + "\n" + "Quant à toi " + this.joueur_2.getNomDuJoueur() + " tu auras le symbole : " + this.joueur_2.getSymbolJoueur());
        
    }
    /**************************************************************************************************************************************************/


    /*************************************** LANCEMENT DE LA PARTIE ************************************************/
    public void play(){
        
        /* Boucle pour continuer de joueur tant que la partie n'est pas gagnée */ 
        while (joueur_1.win(this.plancheDeJeu.grilleDeMorpion) != true) {
            
            
            /* Tour du Joueur_1 */    
            System.out.println("\n" + "C'est à ton tour" + this.joueur_1.getNomDuJoueur() + " , entre un nombre pour choisir une ligne : "+"\n");
            Scanner scan = new Scanner(System.in);
            int entreeRow = scan.nextInt();
            System.out.println("\n" + "Maintenant, entre un nombre pour choisir la colonne : " + "\n");
            int entreeColumn = scan.nextInt();    
            /***************************************/


            /* Envoie des données à notre instance de grille de morpion */
            this.plancheDeJeu.fill(this.joueur_1.symbolJoueur , entreeRow, entreeColumn);
            this.plancheDeJeu.display();
            /***************************************/
            if(joueur_1.win(this.plancheDeJeu.grilleDeMorpion) == true){
                scan.close();
                System.out.println("\n" + this.joueur_1.getNomDuJoueur() + " a gagné la partie !");
            }

            /* Tour du Joueur_2 */ 
            System.out.println("\n" + "C'est à ton tour joueur 2, entre un nombre pour choisir une ligne : " + "\n");
            Scanner scan2 = new Scanner(System.in);
            int entreeRow2 = scan.nextInt();
            System.out.println("\n" + "Maintenant, entre un nombre pour choisir la colonne : "+ "\n");
            int entreeColumn2 = scan.nextInt();

            this.plancheDeJeu.fill(this.joueur_2.symbolJoueur , entreeRow2, entreeColumn2);
            this.plancheDeJeu.display();
            /***************************************/

            /* Condition a chq tour pour voir si un joueur a gagné */ 
            if(joueur_2.win(this.plancheDeJeu.grilleDeMorpion) == true){
                scan2.close();
                System.out.println("\n" + this.joueur_2.getNomDuJoueur() + " a gagné la partie !");
            }
        }


        // if(joueur_1.win(this.plancheDeJeu.grilleDeMorpion) == true){
        //     System.out.println("\n" + this.joueur_1.getNomDuJoueur() + " a gagné la partie !");
        // }else if(joueur_2.win(this.plancheDeJeu.grilleDeMorpion) == true){
        //     System.out.println("\n" + this.joueur_2.getNomDuJoueur() + " a gagné la partie !");
        // }
           
    }   
    /*****************************************************************************************************************/

    

    
}