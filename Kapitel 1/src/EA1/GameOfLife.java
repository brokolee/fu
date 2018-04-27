package EA1;

public class GameOfLife {
    boolean[][] feld = { { false, false, false, false, false }, { false, false, true, false, false },
            { false, false, true, false, false }, { false, false, true, false, false },
            { false, false, false, false, false } };

    public static void main(String[] args) {
        GameOfLife myGame = new GameOfLife();
        myGame.print();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            myGame.nextGeneration();
            myGame.print();
            System.out.println();
        }
    }

    void print() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] == true)
                    System.out.print("o ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    void nextGeneration() {
        boolean[][] alteGeneration = this.feld;
        boolean[][] neueGeneration = alteGeneration;
        //int counter = 0;
        int[] ZellenTrue = new int[5];
        
        // Lebende Zellen erkennen und im Array ZellenTrue vermerken
        for (int i = 1; i < neueGeneration.length; i++) {
            
           // counter = 0;
            for (int j = 1; j < neueGeneration[i].length; j++) {
                if (alteGeneration[i][j] == true) {
                    //counter++;
                    //System.out.println("Counter:" + counter);
                    ZellenTrue[i] = j;              

                }
            }
        }
        
        //8 Zellen um lebende Zellen auf lebend Testen und ggf töten
       if(neueGeneration[1][ZellenTrue[1]] == true) {
       
       
            for (int i = 1; i < 3; i++) {
                neueGeneration[i][ZellenTrue[i]] = true;
                neueGeneration[i][ZellenTrue[1]-1] = true;
                neueGeneration[i][ZellenTrue[1]+1] = true;
                
            }}
              
            
               
        
        
        for (int i = 0; i < ZellenTrue.length; i++) {
            if(ZellenTrue[i] != 0) {
            System.out.println("[" + i + "]=" +ZellenTrue[i]);}
        }

        
        this.feld = neueGeneration;
    }

}