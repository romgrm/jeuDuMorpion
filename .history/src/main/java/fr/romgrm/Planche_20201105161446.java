package fr.romgrm;

public class Planche {
    
    //private String nomDeLaPlanche;
    Player [][] grilleDeMorpion;  
    
    /*CONSTRUCTOR*/
    public Planche() {
        this.grilleDeMorpion = new Player[3][3];
        for (int x = 0; x < cases.length; x++) {
            for (int y = 0; y < cases[x].length; y++) {
                cases[x][y] = Pion.EMPTY;
            }
        }
    }
    // /*GETTER*/
    // public String getNomDeLaPlanche() {
    //     return nomDeLaPlanche;
    // }
    // /*SETTER*/
    // public void setNomDeLaPlanche(String nomDeLaPlanche) {
    //     this.nomDeLaPlanche = nomDeLaPlanche;
    // }

    // J'ai déclaré ma planche de morpion, je dois désormais la créer via un tableau 
    
    public Board() {
        this.cases = new Pion[3][3];
        for (int x = 0; x < cases.length; x++) {
            for (int y = 0; y < cases[x].length; y++) {
                cases[x][y] = Pion.EMPTY;
            }
        }
    }
    
}