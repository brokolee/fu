package bsp_AdressBuchGUI;

import java.util.Iterator;

public interface AddressBookDataModel {
    void addPerson(Person p);
    
    Iterator<Person> iterator();
}
