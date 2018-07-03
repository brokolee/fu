package bsp_lambda_filter;

public interface FilterPredicate<T> {
    boolean isMatching(T candidate);
}
