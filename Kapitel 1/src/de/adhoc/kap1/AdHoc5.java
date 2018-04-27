package de.adhoc.kap1;

public class AdHoc5 {

    public static void main(String[] args) {
    int[][] treppenArr = new int[11][];    
        
    for (int i = 0; i < treppenArr.length; i++) {
        treppenArr[i] = new int[i];
        for (int j = 0; j < i; j++) {
            treppenArr[i][j] = j;
        }
    }

    for (int i = 0; i < treppenArr.length; i++) {
        System.out.println();
        for(int j = 0; j < treppenArr[i].length; j++) {
            System.out.print(treppenArr[i][j]+ " ");
        }
    }
        
        
    }
    

}
