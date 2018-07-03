package bsp_AdressBuchGUI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddressBookDataModel implements AddressBookDataModel, Serializable {
    
    private ArrayList<Person> persons;
    
    public ArrayListAddressBookDataModel() {
        persons = new ArrayList<Person>();
    }

    @Override
    public void addPerson(Person p ) {
        persons.add(p);
    }

    @Override
    public Iterator<Person> iterator() {
        // TODO Auto-generated method stub
        return persons.iterator();
    }
    
}
