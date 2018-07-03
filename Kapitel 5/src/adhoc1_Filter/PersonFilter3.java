package adhoc1_Filter;

public class PersonFilter3 implements FilterPredicate<Person>{
    @Override
    public boolean isMatching(Person candidate) {
        return candidate.getWeight() < 60.0;
    }

}
