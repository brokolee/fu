package de.adhoc.kap1;



    public class Person {
        String name;
        int birthday; /* in der Form JJJJMMTT */

       public Person(String name1, int birthday1) {
            this.name = name1;
            this.birthday = birthday1;
        }

       public void print() {
            System.out.println("Name: " + this.name);
            System.out.println("Geburtsdatum: " + this.birthday);
        }

        public boolean isBirthday(int date) {
            return birthday % 10000 == date % 10000;
        }
    }
