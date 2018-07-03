package bsp_AdressBuchGUI;

import java.awt.*;
import java.awt.event.*;

public class Controller extends WindowAdapter implements ActionListener {
    private PersonPanel view;
    private Frame mainFrame;

    private AddressBookDataModel model;
    private FullPersistance persistance;

    public Controller(AddressBookDataModel model, PersonPanel view, FullPersistance persistance, Frame mainFrame) {
        this.model = model;
        this.view = view;
        this.persistance = persistance;
        this.mainFrame = mainFrame;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        createAndShowNewPersonDialog();

    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            persistance.storeBook(model);
            System.out.println("Adressbuch gespeichert!");
        } catch (AddressBookException abe) {
            System.out.println("Adressbuch konnte NICHT gespeichert werden!");
            abe.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    private void createAndShowNewPersonDialog() {
        Dialog newPersonDialog = new Dialog(mainFrame, "Neue Person", true);
        Panel dataPanel = new Panel(new GridLayout(4, 2));
        TextField preNameTextField = new TextField(30);
        TextField lastNameTextField = new TextField(30);
        TextField phoneTextField = new TextField(30);
        dataPanel.add(new Label("Vorname: "));
        dataPanel.add(preNameTextField);
        dataPanel.add(new Label("Nachname: "));
        dataPanel.add(lastNameTextField);
        dataPanel.add(new Label("Telefon: "));
        dataPanel.add(phoneTextField);
        newPersonDialog.add(dataPanel, BorderLayout.CENTER);

        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Person newPerson = new Person(preNameTextField.getText(), lastNameTextField.getText(),
                        phoneTextField.getText());
                model.addPerson(newPerson);
                view.refresh();
                newPersonDialog.dispose();
            }

        });

        Panel southPanel = new Panel();
        southPanel.add(okButton);
        newPersonDialog.add(southPanel, BorderLayout.SOUTH);
        newPersonDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                newPersonDialog.dispose();
            }
        });
        
        newPersonDialog.pack();
        newPersonDialog.setLocationRelativeTo(mainFrame);
        newPersonDialog.setVisible(true);

    }

}
