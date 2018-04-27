package de.adhoc.kap1;

public class AddressBuch {
    Person[] persons;
    int frei = 0;

    // Constructor
    public AddressBuch(int AddressBuchLength) {
        if (AddressBuchLength < 1) {
            persons = new Person[1];
        } else {
            persons = new Person[AddressBuchLength];
        }
    }

    public void addPerson(String name, int birthday) {
        if (frei >= persons.length) {
            this.persons = kopieren(this.persons);
        }

        this.persons[frei] = new Person(name, birthday);
        frei++;
    }

    private Person[] kopieren(Person[] Quelle) {
        int index = 0;
        Person[] Ziel = new Person[Quelle.length * 2];
        for (@SuppressWarnings("unused") Person person : Quelle) {
            Ziel[index] = Quelle[index];
            index++;
        }
        return Ziel;
    }

    public void print() {
        int einträge = 0;
        System.out.println("Kapazität: " + this.persons.length);
        System.out.println();
        for (int i = 0; i < frei && this.persons[i] != null; i++) {
            System.out.println("Eintrag: " + einträge + "  Name: " + this.persons[i].name + "  Geburtstag: "
                    + this.persons[i].birthday);
            einträge++;
        }
        System.out.println("Einträge: " + einträge);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        AddressBuch Test = new AddressBuch(3);
        Test.addPerson("test1", 12131988);
        Test.addPerson("Meier", 34341998);
        Test.addPerson("Müller", 63278888);
        Test.print();
        Test.addPerson("EinerZuviel", 462738);
        Test.print();
    }
}
