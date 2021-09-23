import java.util.*;

public class ValidateSubsequence {
//    public String tournamentWinner(
//            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
//        Map<String, Integer> map= new HashMap<>();
//        for(int i=0;i<competitions.size();i++) {
//            String wonTeam=null;
//            if(results.get(i).equals(0)) {
//                wonTeam = competitions.get(i).get(1);
//                map.put(wonTeam, map.getOrDefault(wonTeam, 0)+1);
//            } else {
//                wonTeam = competitions.get(i).get(0);
//                map.put(wonTeam, map.getOrDefault(wonTeam, 0)+1);
//            }
//        }
//        // Write your code here.
//        return map.entrySet()
//                .stream()
//                .sorted((i1, i2)-> i2.getValue().compareTo(i1.getValue()))
//                .limit(1).map(p->p.getKey()).findAny().orElse(null);
//    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
       int arrIdx=0;
       int seqIdx=0;
       while(arrIdx< array.size()&& seqIdx<sequence.size()) {
           if(array.get(arrIdx).equals(sequence.get(seqIdx))) {
               seqIdx++;
           }
           arrIdx++;
       }
       return seqIdx == sequence.size();
    }
    public static void main(String[] args) {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        boolean isValid = isValidSubsequence(array, sequence);
        System.out.println(isValid);
    }
}
