package adhoc2;

public class PDFDoc implements Printable {
    String text;
    
    
    public PDFDoc(String text) {
        this.text = text;
    }
    
    public void print() {
        System.out.println(text);
    }

}
