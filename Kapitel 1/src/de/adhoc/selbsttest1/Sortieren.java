package de.adhoc.selbsttest1;

public class Sortieren {
  

public static void main (String[] args) {
    
    // Einen double-Array erzeugen, der genauso gross
    // ist wie der String-Array args
    double[] feld = new double[args.length];
    
    // alle Zahlen, die in args als Strings
    // vorliegen, in double-Werte umwandeln
    // und in den Array feld eintragen
           
        for(int i = 0; i < args.length; i++) {
            feld[i] = Double.parseDouble(args[i]);
           }
                // Hier Programmcode zum Sortieren einfuegen
                // Hier Programmcode zur Bestimmung und
                // Ausgabe des groessten Elements einfuegen
        for(int i = 0; i < args.length; i = i + 1) 
            System.out.println(i + ". " + feld[i]);
        
        System.out.println();
        System.out.println();
        
for (int i = 0; i < feld.length; i++) {
    for (int j = 0; j < feld.length; j++) {
        if(feld[i] > feld[j]) {
            double h = feld[j];
            feld[j] = feld[i];
            feld[i] = h;
        }
}
        
    }
        // den Inhalt des Arrays feld ausgeben
       for(int i = 0; i < args.length; i = i + 1) 
       System.out.println(i + ". " + feld[i]);
        }
}
