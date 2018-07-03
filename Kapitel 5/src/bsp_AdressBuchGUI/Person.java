package bsp_AdressBuchGUI;

import java.io.Serializable;

public class Person implements Serializable {

    private final String firstName;
    private final String lastName;
    private final String phone;

    public Person(String lastName, String firstName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

}
