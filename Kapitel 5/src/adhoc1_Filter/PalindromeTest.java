package adhoc1_Filter;

import java.util.ArrayList;
import java.util.List;

public class PalindromeTest {
    public static void main(String[] args) {

        ArrayList<String> source = new ArrayList<String>();

        source.add("Elefant");
        source.add("Rentner");
        source.add("Kathedrale");
        source.add("Regallager");
        source.add("Regen");

        Filter<String> paliFilter = new Filter<>(source);

        // anonyme Klasse - Klasse PalindromeFilter damit hinfällig.

        List<String> result = paliFilter.filter(new FilterPredicate<String>() {
            @Override
            public boolean isMatching(String candidate) {
                StringBuilder sb = new StringBuilder(candidate);
                String reverse = sb.reverse().toString();
                return candidate.equalsIgnoreCase(reverse);
            }
        });

        for (String string : result) {
            System.out.println(string);
        }

    }
}
