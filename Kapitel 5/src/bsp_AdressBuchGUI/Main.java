package bsp_AdressBuchGUI;

import java.awt.Button;
import java.awt.Frame;
import java.io.File;


public class Main {

    private static final String ADDRESSBOOK_DEFAULT_NAME = "test.ab";

    private SerializationToFilePersistance persistence;

    private AddressBookDataModel model;

    private Frame mainFrame;

    private Controller controller;

    public Main() throws AddressBookException {
        initModelAndPersistence();
        PersonPanel personPanel = new PersonPanel(model);
        Button newPersonButton = new Button("Neuer Eintrag");
        mainFrame = new AddressBookMainFrame(personPanel, newPersonButton);
        controller = new Controller(model, personPanel, persistence, mainFrame);
        newPersonButton.addActionListener(controller);
        mainFrame.addWindowListener(controller);
        mainFrame.setVisible(true);

    }

    private void initModelAndPersistence() throws AddressBookException {
        String addressBookDirPath = System.getProperty("user.home") + "/addressbooks";
        System.out.println(addressBookDirPath);
        File addressBookDir = new File(addressBookDirPath);
        System.out.println("mkdir:" + addressBookDir.mkdir());
        addressBookDir.mkdir();
        String addressBookPath = addressBookDirPath + "/" + ADDRESSBOOK_DEFAULT_NAME;
        persistence = new SerializationToFilePersistance(addressBookPath);
        File addressBookFile = new File(addressBookPath);
        if (addressBookFile.exists()) {
            System.out.println("Adressbuch gefunden! Lade...");
            model = persistence.loadBook();
        } else {
            System.out.println("Adressbuch NICHT gefunden! Erstelle ...");
            model = new ArrayListAddressBookDataModel();
        }

    }

    public static void main(String args[]) throws AddressBookException {
        new Main();
    }
}
