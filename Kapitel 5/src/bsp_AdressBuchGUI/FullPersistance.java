package bsp_AdressBuchGUI;

public interface FullPersistance {
    AddressBookDataModel loadBook() throws AddressBookException;
    
    void storeBook(AddressBookDataModel book) throws AddressBookException;
    
}
