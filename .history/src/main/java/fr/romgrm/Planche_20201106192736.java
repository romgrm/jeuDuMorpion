package fr.romgrm;

public class Planche {
    
    //private String nomDeLaPlanche;
    char [][] grilleDeMorpion; 
    Player player;  
    
    
    /*************** CONSTRUCTOR ***************/
    public Planche() {
        this.grilleDeMorpion = new char[3][3];
        // for (int x = 0; x < grilleDeMorpion.length; x++) {
        //     for (int y = 0; y < grilleDeMorpion[x].length; y++) {
        //         System.out.println("---------------");
        //         //this.grilleDeMorpion[x][y];
        //     }
        // }
    }
    /*****AFFICHAGE DE LA GRILLE DE MORPION*******/
    public void display() {
        System.out.print("\n");
        for (int x = 0; x < grilleDeMorpion.length; x++) {
            System.out.print("    "+x);
        }
        System.out.println();
        for (int x = 0; x < grilleDeMorpion.length; x++) {
            //System.out.print(x);
            System.out.println(x + "---------------");
            for (int y = 0; y < grilleDeMorpion[x].length; y++) {
                System.out.print(" "+"|" +"   "+ grilleDeMorpion[x][y]);
                
            }
            System.out.println("|");
        }
        System.out.println();
    }
    /*************************************************/


    /**************** GETTERS & SETTERS *****************/
    public char[][] getGrilleDeMorpion() {
        return grilleDeMorpion;
    }

     public void setGrilleDeMorpion(char[][] grilleDeMorpion) {
        this.grilleDeMorpion = grilleDeMorpion;
    }
    /***********************************************************/


    /******************* REMPLISSAGE DE LA GRILLE *****************/
    public void fill(char symbolJoueur, int entreeRow, int entreeColumn ){
        this.grilleDeMorpion[entreeRow][entreeColumn] = symbolJoueur ; 
    }

    /* je remplie mon tableau qui attend du Char, en injectant le paramètre
    char symbolJoueur, aux coordonées taper dans le scan (entreeRow/entreeColumn)*/
    /************************************************************************/
    
    
    
    
}
