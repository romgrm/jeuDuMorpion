package fr.romgrm;

public class Planche {
    
    //private String nomDeLaPlanche;
    char [][] grilleDeMorpion; 
    //Player player;   
    
    /*CONSTRUCTOR*/
    public Planche() {
        this.grilleDeMorpion = new char[3][3];
        // for (int x = 0; x < grilleDeMorpion.length; x++) {
        //     for (int y = 0; y < grilleDeMorpion[x].length; y++) {
        //         System.out.println("---------------");
        //         //this.grilleDeMorpion[x][y];
        //     }
        // }
    }

    public void display() {
        System.out.print("\n");
        for (int x = 0; x < grilleDeMorpion.length; x++) {
            System.out.print("  "+x);
        }
        System.out.println();
        for (int x = 0; x < grilleDeMorpion.length; x++) {
            System.out.print(x);
            for (int y = 0; y < grilleDeMorpion[x].length; y++) {
                System.out.print(" "+"|" +" "+ grilleDeMorpion[x][y]);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public char[][] getGrilleDeMorpion() {
        return grilleDeMorpion;
    }

    // public void setGrilleDeMorpion(Player[][] grilleDeMorpion) {
    //     this.grilleDeMorpion = grilleDeMorpion;
    // }

    public void fill(char symbolJoueur, int entreeRow, int entreeColumn ){
        this.grilleDeMorpion[entreeRow][entreeColumn] = symbolJoueur ; 
    }
    
}