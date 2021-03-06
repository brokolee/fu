package SA1;

import SA1.PrintableList.ListIterator;

public class PrintableListTest {

    public static void main(String[] args) {
        Person person = new Person("Käptn Blaubaer");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Book book = new Book("Gebeutelter Bilbo");
        Person person2 = new Person("JRR Lolkien");
        
        PrintableList plist = new PrintableList();
        plist.addLast(person);
        plist.addLast(cat1);
        plist.addLast(cat2);
        plist.addLast(cat3);
        plist.addLast(book);
        plist.addLast(person2);
        
        ListIterator iti = plist.listIterator();

        while (iti.hasNext() == true) {
            iti.next().print();
        }
        
        

    }

}
