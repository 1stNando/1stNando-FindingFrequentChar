import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char most = ' ';
        int highest = 0;

        for (int i = 0; i < str.length(); i++) {
            
            char c = str.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            
            if (map.get(c) > highest) {
                highest = map.get(c);

                most = c;
            }

        }
        return most;
    }
}
