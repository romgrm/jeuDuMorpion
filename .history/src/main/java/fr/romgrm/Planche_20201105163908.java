package fr.romgrm;

public class Planche {
    
    //private String nomDeLaPlanche;
    Player [][] grilleDeMorpion;  
    
    /*CONSTRUCTOR*/
    public Planche() {
        this.grilleDeMorpion = new Player[3][3];
        for (int x = 0; x < grilleDeMorpion.length; x++) {
            for (int y = 0; y < grilleDeMorpion[x].length; y++) {
                grilleDeMorpion[x][y] = null;
            }
        }
    }

    public void display() {
        System.out.print("\n");
        for (int x = 0; x < grilleDeMorpion.length; x++) {
            System.out.print("A   B   C");
        }
        System.out.println();
        for (int x = 0; x < grilleDeMorpion.length; x++) {
            System.out.print(x);
            for (int y = 0; y < grilleDeMorpion[x].length; y++) {
                System.out.print("|" + grilleDeMorpion[x][y]);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public Player[][] getGrilleDeMorpion() {
        return grilleDeMorpion;
    }

    public void setGrilleDeMorpion(Player[][] grilleDeMorpion) {
        this.grilleDeMorpion = grilleDeMorpion;
    }
    
}