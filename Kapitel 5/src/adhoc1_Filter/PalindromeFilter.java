package adhoc1_Filter;

public class PalindromeFilter implements FilterPredicate<String> {
    @Override
    public boolean isMatching(String candidate) {
        StringBuilder sb = new StringBuilder(candidate);
        String reverse = sb.reverse().toString();
        return candidate.equalsIgnoreCase(reverse);
    }

}
