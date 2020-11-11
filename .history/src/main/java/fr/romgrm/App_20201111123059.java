package fr.romgrm;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Game nouvellePartie = new Game();
        nouvellePartie.newGame();
        nouvellePartie.play();
        //nouvellePartie.replay();
        
    }
}
