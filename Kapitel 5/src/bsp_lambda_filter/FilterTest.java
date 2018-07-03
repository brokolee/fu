package bsp_lambda_filter;

import java.util.*;

public class FilterTest {
    public static void main(String[] args) {

        ArrayList<Person> source = new ArrayList<Person>();

        source.add(new Person("Alice", 56.3));
        source.add(new Person("Joe", 77.0));
        source.add(new Person("Bob", 90.2));
        source.add(new Person("Jenny", 44.2));
        source.add(new Person("Anna", 51.9));
        source.add(new Person("Peter", 84.3));

        Filter<Person> personFilter = new Filter<>(source);
        
        List<Person> shortNameList = personFilter.filter(
                p -> p.getName().length() < 5);
        
        for (Person person : shortNameList) {
            System.out.println(person.getName());
        }

    }
}
