package adhoc2;

public class Letter extends PostalItem implements Printable{

    String Message;

    
    
    public Letter(String Absender, String Empfänger, String Message, double weight) {
       super(Absender, Empfänger, weight);
       this.Message = Message;
    }

    @Override
    public void print() {
        System.out.println("BRIEF Absender:" + this.getAbesender() + "Empfänger:" + this.getEmpfänger());
        System.out.println("Nachricht: " + this.Message);
        
    }
    
    public double getWeight() {
        return super.getWeight();
    }
    
    

}

