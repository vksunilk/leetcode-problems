import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] output = slidingWindowMaximum(nums, k);
        for(int i:output){
            System.out.println(i);
        }
    }
    private static int[] slidingWindowMaximum(int[] nums, int k){
        Deque<Integer> dq= new ArrayDeque<>();
        List<Integer> ls = new ArrayList<>();
        int currMax=Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            dq.offerLast(nums[i]);
            currMax=Math.max(currMax,nums[i]);
        }
        ls.add(currMax);
        for (int i = k; i < nums.length; i++) {
            dq.offerLast(nums[i]);
            if(dq.pollFirst()<nums[i]){
                ls.add(nums[i]);
            }

        }

        return ls.stream().mapToInt(Integer::intValue).toArray();
    }
}
