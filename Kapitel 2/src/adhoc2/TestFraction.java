package adhoc2;

public class TestFraction {
public static void main(String[] args) {
   Fraction dreiachtel =  new Fraction(3, 8);
   Fraction sechszehntel = new Fraction(6, 10);
   //Fraction durch0 = new Fraction(12, 0);
    System.out.println(dreiachtel.toString());
    System.out.println(sechszehntel.toString());
    System.out.println(dreiachtel.multiplyBy(sechszehntel).toString());
}
}
