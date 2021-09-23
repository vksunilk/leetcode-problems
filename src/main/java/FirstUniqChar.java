import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main( String[] args) {
        String s = "leetcode";
        System.out.print(firstUniqueChar(s));
    }
    private static int firstUniqueChar(String s) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        return map.entrySet().stream()
                .filter(p-> p.getValue().equals(1))
                .findFirst()
                .map(Map.Entry::getKey)
                .map(s::indexOf)
                .orElse(-1);
    }

}
