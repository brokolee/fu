package adhoc3;

import java.io.IOException;

public class utilArrays {

    public static void main(String[] args) throws IOException {
        int[] utilArray = new int[] { 3, 10, 2, 47, 1, 4 };
        System.out.println("Bitte (1) für parallelSort eingeben / (2) für sort eingeben!");
        int inInt = (System.in.read());
        
        switch (inInt) {
        case 49:
            System.out.println("parallelSort:");
            java.util.Arrays.parallelSort(utilArray);
            break;
        case 50:
            System.out.println("sort:");
            java.util.Arrays.sort(utilArray);
            break;
        default:
            System.out.println("Keine valide Eingabe - gebe Array aus:");
            break;
        }

        for (int i = 0; i < utilArray.length; i++) {
            System.out.println(utilArray[i]);
        }

    }

}
