package adhoc8;

public class NumberContainerWithMaximum extends NumberContainer{
    private Number maximum;
    
    public void store(Number element) {
        super.store(element);
        if(maximum == null || element.doubleValue() > maximum.doubleValue()) {
            maximum = element.doubleValue();
        }
        
    }

    public Number getMaximum() {
        return maximum;
    }
    
    public static void main(String[] args) {
        NumberContainerWithMaximum maxContainer = new NumberContainerWithMaximum();
        maxContainer.store(3);
        maxContainer.store(3.21);
        maxContainer.store(0.00048267200);
        
        System.out.println("Max:" + maxContainer.getMaximum());
    }
    
}
