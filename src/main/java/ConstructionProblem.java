import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructionProblem {
    public static void main(String[] args){
        int[][] cost = new int[][]{
                {2,1,2},
                {1,2,2},
                {2,2,1}};
//        List<List<Integer>> cost = new ArrayList<>();
//        cost.add(Arrays.asList(1,2,3));
//        cost.add(Arrays.asList(1,2,3));
//        cost.add(Arrays.asList(3,3,1));
        int minCost = minCost(cost);
        System.out.println(minCost);
    }

    public static int minCost(List<List<Integer>> cost) {
        for (int i = 1; i < cost.size(); i++) {
            cost.get(i).set(0, cost.get(i).get(0) + Math.min(cost.get(i - 1).get(1), cost.get(i - 1).get(2)));
            cost.get(i).set(1, cost.get(i).get(1) + Math.min(cost.get(i - 1).get(0), cost.get(i - 1).get(2)));
            cost.get(i).set(2, cost.get(i).get(2) + Math.min(cost.get(i - 1).get(0), cost.get(i - 1).get(1)));
        }
        int n = cost.size();
        return Math.min(cost.get(n - 1).get(0), Math.min(cost.get(n - 1).get(1), cost.get(n - 1).get(2)));
    }
    public static int minCost(int[][] cost) {
        for(int i = 1; i<cost.length; i++ ){
            cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]);
            cost[i][1] += Math.min(cost[i-1][0], cost[i-1][2]);
            cost[i][2] += Math.min(cost[i-1][0], cost[i-1][1]);
        }
        int n = cost.length;
        return Math.min(cost[n-1][0], Math.min(cost[n-1][1],cost[n-1][2]) );
    }
}
