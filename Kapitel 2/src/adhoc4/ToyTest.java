package adhoc4;

public class ToyTest {

    public static void main(String[] args) throws IllegalArgumentException{
        ToyFactory Fabrik = new ToyFactory();
        Toy Rubby = Fabrik.getToy("rubberduck");
        Rubby.print();
        Toy Roosevelt = Fabrik.getToy("teddy");
        Roosevelt.print();
        Toy BlaBlaCar = Fabrik.getToy("233");
        BlaBlaCar.print();
        
    }

}
