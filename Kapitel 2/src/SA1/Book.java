package SA1;

public class Book implements Printable {
    private String title;
    
    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Klasse Book / Titel:" +  title);
    }
}
