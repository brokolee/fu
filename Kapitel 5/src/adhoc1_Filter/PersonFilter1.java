package adhoc1_Filter;

public class PersonFilter1 implements FilterPredicate<Person>{
    @Override
    public boolean isMatching(Person candidate) {
        return candidate.getName().length() < 5;
    }

}
