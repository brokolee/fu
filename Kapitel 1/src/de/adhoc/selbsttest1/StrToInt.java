package de.adhoc.selbsttest1;

public class StrToInt {

    private static int ggT(int x, int y) {
        while (y != 0) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }
    
    private static String  ggTswitch(int ggT) {
        switch (ggT) {
        case 1:
            return "ggT ist 1!";
        case 2:
            return "ggT ist 2!";
            
        case 3:
            return "ggT ist 3!";
            
        case 4:
            return "ggT ist 4";
           
        default:
            return "ggT ist größer als 4!";
            
        }
    }

    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        
        System.out.println(ggT(arg1, arg2));
        System.out.println(ggTswitch(ggT(arg1, arg2)));

    }

}
