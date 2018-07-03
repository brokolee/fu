package bsp_AdressBuchGUI;

import java.awt.*;
import java.util.Iterator;

public class PersonPanel extends Panel {
    private AddressBookDataModel model;

    private static final Color EQAL_ROW_COLOR = new Color(240, 240, 255);
    private static final Color ODD_ROW_COLOR = new Color(255, 255, 240);

    public PersonPanel(AddressBookDataModel model) {
        this.model = model;
        setBackground(Color.BLACK);
        setLayout(new GridLayout(0, 3, 0, 1));
        refresh();
    }

    public void refresh() {
        removeAll();
        boolean isEqualRowNumber = true;
        Iterator<Person> iterator = model.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            Color rowColor = isEqualRowNumber ? EQAL_ROW_COLOR  :   ODD_ROW_COLOR;
            Label firstNameLabel = new Label(person.getFirstName());
            firstNameLabel.setBackground(rowColor);
            add(firstNameLabel);
            Label lastNameLabel = new Label(person.getLastName());
            lastNameLabel.setBackground(rowColor);
            add(lastNameLabel);
            Label phoneLabel = new Label(person.getPhone());
            phoneLabel.setBackground(rowColor);
            add(phoneLabel);
            isEqualRowNumber = !isEqualRowNumber;
        }
        revalidate();
    }

}
