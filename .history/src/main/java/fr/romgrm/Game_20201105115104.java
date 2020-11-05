package fr.romgrm;

public class Game {
    public void newGame(){
        System.out.println("Commençons une partie de Morpion !");

        // je veux afficher la planche de morpion
        // je dois donc créer une class planche de jeu et l'afficher ici

        Planche plancheDeJeu = new Planche("Planche"); 

        System.out.println(plancheDeJeu.getNomDeLaPlanche());
    }
}