package adhoc7;

public class Person {

    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    String getFirstname() {
        return firstname;
    }

    String getLastname() {
        return lastname;
    }
}
