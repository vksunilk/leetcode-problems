import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequency {
    public static void main(String[] args) {

        List<String> list  = new ArrayList<>();

        list.add("redPants");
        list.add("blueShirt");
        list.add("yellowTie");
        list.add("yellowTie");
        list.add("yellowTie");
        list.add("redPants");
        list.add("orangeFrock");
        list.add("purplelace");
        list.add("redPants");
        list.add("redPants");
        list.add("redPants");

        String r = findMax(list);
        System.out.println(r);
    }

    public static String findMax(List<String> productList) {
        Map<String, Long> collect = productList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        int max = collect.values().stream().mapToInt(Math::toIntExact).filter(stringLongEntry -> stringLongEntry >= 0).max().orElse(0);

        return collect.entrySet()
                .stream()
                .filter(p->p.getValue()==max)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .findFirst()
                .orElse(null);

//        return list.stream().sorted().collect(Collectors.toList()).get(list.size() - 1);

    }
}
