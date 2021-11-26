import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[] {10,4,3,7,8,2,1};
        new MergeSort().mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    private void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, helper,0,array.length-1);
    }
    private void mergeSort(int[] array, int[] helper, int low, int high) {
        int mid = (low+high)/2;
        mergeSort(array,helper,low,mid);
        mergeSort(array,helper,mid,high);
        merge(array, helper, low,mid,high);
    }

    private void merge(int[] array, int[] helper, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            helper[i]= array[i];
        }
        int helperLeft =low;

    }
}
