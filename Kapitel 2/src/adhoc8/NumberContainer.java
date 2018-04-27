package adhoc8;

public class NumberContainer {
    private Number element;

    
    /* Boxing happens here! :) */ 
    public void store(Number element) {
        this.element = element;
    }

    public Number get() {
        return element;
    }
}
