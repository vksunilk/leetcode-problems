import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] out = twoSum(new int[]{2,7,11,15},9);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                out[0]=map.get(target-nums[i])+1;
                out[1]=i+1;
            }
            map.put(nums[i], i);
        }
        return out;
    }
}
