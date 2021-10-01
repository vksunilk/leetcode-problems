import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,5,2,1,4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums) {
        int i=0;
        while (i< nums.length){
            int correctIndex=nums[i]-1;
            if(nums[correctIndex]!=nums[i]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
