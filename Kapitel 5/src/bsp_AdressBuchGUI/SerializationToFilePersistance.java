package bsp_AdressBuchGUI;

import java.io.*;

public class SerializationToFilePersistance implements FullPersistance {

    private String addressBookPath;

    public SerializationToFilePersistance(String addressBookPath) {
        // TODO Auto-generated constructor stub
        this.addressBookPath = addressBookPath;

    }

    @Override
    public AddressBookDataModel loadBook() throws AddressBookException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(addressBookPath));
            return (AddressBookDataModel) ois.readObject();
        } catch (IOException e) {
            throw new AddressBookException(e);
        } catch (ClassNotFoundException e) {
            throw new AddressBookException(e);

        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void storeBook(AddressBookDataModel book) throws AddressBookException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(addressBookPath));
            oos.writeObject(book);
        } catch (IOException e) {
            throw new AddressBookException(e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
