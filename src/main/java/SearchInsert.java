//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},0));
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
        System.out.println(searchInsert(new int[]{1,3,5,6},5));
    }
    static int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target) {
                return mid;
            } else if(target>nums[mid]) {
                left=mid+1;
            } else if(target<nums[mid]) {
                right=mid-1;
            }
        }
        return left;
    }
}
