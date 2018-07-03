package adhoc1_Filter;

public interface FilterPredicate<T> {
    boolean isMatching(T candidate);
}
