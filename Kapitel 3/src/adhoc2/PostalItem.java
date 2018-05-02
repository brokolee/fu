package adhoc2;

public class PostalItem implements Weighable{
    
    private String Absender;
    private String Empfänger;
    private double weight;
    
    
    
    public PostalItem(String Absender, String Empfänger, double weight) {
        this.Absender = Absender;
        this.Empfänger = Empfänger;
        this.weight = weight;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public String getAbesender() {
        return this.Absender;
    }
    
    public String getEmpfänger() {
        return Empfänger;
    }
    
}
