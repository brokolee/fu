package adhoc1_Filter;

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

        // lokale Klasse statt einer seperaten (PersonFilter1) Klasse

        /*
         * ###lokale Klasse###
         * 
         * class PersonFilter2 implements FilterPredicate<Person>{
         * 
         * @Override public boolean isMatching(Person candidate) { return candidate.getName().length() < 5; } }
         * 
         * 
         * FilterPredicate<Person> hasShortName = new PersonFilter2();
         */

        // anonyme Klasse - ist immer auch eine lokale Klasse

        FilterPredicate<Person> hasShortName = new FilterPredicate<Person>() {
            @Override
            public boolean isMatching(Person candidate) {
                return candidate.getName().length() < 5;
            }
        };

        List<Person> result = personFilter.filter(hasShortName);
        for (Person person : result) {
            System.out.println(person.getName());
        }

    }
}
