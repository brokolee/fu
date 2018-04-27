package SA2;

public class WochentagTest {
    public static void main(String[] args) throws KeinTagException {
        Wochentag wochentag = new Wochentag();

        for (int i = 0; i < 7; i++) {

            System.out.println(wochentag.toString());
            wochentag.naechsterTag();
        }

        System.out.println("-------------------------");

        for (int i = 0; i < 7; i++) {
            System.out.println(wochentag.toString());
            wochentag.vorhergehenderTag();
        }
        System.out.println("-----------------------");
        
        wochentag.setTag(4);
        System.out.println(wochentag.toString());
        
        
        
        //wochentag.setTag(10);
        
    }
}
