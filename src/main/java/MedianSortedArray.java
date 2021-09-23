import java.util.Collections;
import java.util.PriorityQueue;

public class MedianSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: nums1) {
            min.offer(i);
            if(max.size()< min.size()){

            }
        }
        return 0.0d;

    }
}
