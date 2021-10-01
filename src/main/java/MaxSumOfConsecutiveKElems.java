public class MaxSumOfConsecutiveKElems {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSumOfConsecutiveKElems(arr, k));
        arr = new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20};
        k=4;
        System.out.println(maxSumOfConsecutiveKElems(arr, k));
    }
    //Sliding window
    private static int maxSumOfConsecutiveKElems(int[] arr, int k) {

        int currSum=0;
        for(int i=0;i<k;i++){
            currSum+=arr[i];
        }
        int maxSum=currSum;
        for(int i=k;i<arr.length;i++){
            currSum+=(arr[i]-arr[i-k]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
