package adhoc2;

import java.util.ArrayList;

public class ArrayListAddressBook {
   private ArrayList<Person> PersonList;

   
    public ArrayListAddressBook(int size) {
        PersonList = new ArrayList<Person>(size);
    }
    
    public void addPerson(Person person) {
        PersonList.add(person);
    }
    
    public void print() {
        
        while(PersonList.iterator().hasNext()) {
            PersonList.iterator().next().print();
        }
        
    }
    
}
