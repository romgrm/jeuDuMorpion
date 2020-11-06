package fr.romgrm;

import java.util.Scanner;

public class Game {
    
    Planche planche; // J'apelle ma class Planche pour avoir une vue dessus  
    Player joueur_1 = new Player("Joueur 1", 'X'); // je créer l'instance de mon joueur 1 
    Player joueur_2 = new Player("Joueur 2", 'O'); // je créer l'instance de mon joueur 2
    Planche plancheDeJeu = new Planche(); // je créer l'instance de ma grille de morpion
    
    
    /****************************************************** CREATION DE LA PARTIE ***************************************************************/
    public void newGame(){

        

        System.out.println("\n" + "\n" + "Chaud pour une partie de Morpion ?? ");

        Scanner scan0 = new Scanner(System.in);
        char start = scan0.next("[Oo|Nn]").charAt(0);
        
        if(start == 'O' || start == 'o'){
            System.out.println("\n"+ "\n" + "Voici la planche de jeu");

            plancheDeJeu.display();
             
            System.out.println("\n"+ "\n" + this.joueur_1.getNomDuJoueur() + " tu auras le symbole : " + this.joueur_1.getSymbolJoueur() + "\n" + "\n" + "Quant à toi " + this.joueur_2.getNomDuJoueur() + " tu auras le symbole : " + this.joueur_2.getSymbolJoueur());
        
        }else{
            System.out.println("\n" + "Dommage, une prochaine fois !");
        }    
    }
    /**************************************************************************************************************************************************/


    /*************************************** LANCEMENT DE LA PARTIE ************************************************/
    public void play(){
        
        /* Boucle pour continuer de joueur tant que la partie n'est pas gagnée */ 
        while (joueur_1.win(this.plancheDeJeu.grilleDeMorpion) != true || joueur_2.win(this.plancheDeJeu.grilleDeMorpion) != true){
            
            
            /* Tour du Joueur_1 */    
            System.out.println("\n" + "C'est à ton tour " + this.joueur_1.getNomDuJoueur() + " , entre un nombre pour choisir une ligne : "+"\n");
            Scanner scan = new Scanner(System.in);
            int entreeRow = scan.nextInt();
            System.out.println("\n" + "Maintenant, entre un nombre pour choisir la colonne : " + "\n");
            int entreeColumn = scan.nextInt();    
            /*****************************************************************************************************/


            /* Envoie des données à notre instance de grille de morpion */
            this.plancheDeJeu.fill(this.joueur_1.symbolJoueur , entreeRow, entreeColumn);
            this.plancheDeJeu.display();
            /*****************************************************************************************************/

            /* Condition a chq tour pour voir si le jouer 1 a gagné en fermant le scan et en return empty pour fermer la loop */ 
            if(joueur_1.win(this.plancheDeJeu.grilleDeMorpion) == true){
                System.out.println("\n" + this.joueur_1.getNomDuJoueur() + " a gagné la partie !");
                // scan.close();
                return;   
            }
            /*****************************************************************************************************/
            
            /* Tour du Joueur_2 */ 
            System.out.println("\n" + "C'est à ton tour joueur 2, entre un nombre pour choisir une ligne : " + "\n");
            Scanner scan2 = new Scanner(System.in);
            int entreeRow2 = scan.nextInt();
            System.out.println("\n" + "Maintenant, entre un nombre pour choisir la colonne : "+ "\n");
            int entreeColumn2 = scan.nextInt();

            this.plancheDeJeu.fill(this.joueur_2.symbolJoueur , entreeRow2, entreeColumn2);
            this.plancheDeJeu.display();
            /*****************************************************************************************************/

            /* Condition a chq tour pour voir si le jouer 2 a gagné */ 
            if(joueur_2.win(this.plancheDeJeu.grilleDeMorpion) == true){
                System.out.println("\n" + this.joueur_2.getNomDuJoueur() + " a gagné la partie !");
                scan2.close();
            }
        }    

        
    }  
    public void replay(){
    System.out.println("Voulez-vous rejouer ? Oui = O / Non = N");
        Scanner scan3 = new Scanner(System.in);
        char replay = scan3.next().charAt(0);

        if(replay == 'O' || replay == 'o'){
           this.play();
        }else{
            return; 
        }
    }
    /*****************************************************************************************************************/

    

    
}