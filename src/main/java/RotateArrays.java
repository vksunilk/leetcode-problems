public class RotateArrays {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7};
        System.out.println(3%nums.length);
        rotate(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
    public static void rotate(int[] nums, int k) {
        int length=nums.length;
        while(k>0) {
            int lastElem= nums[length-1];
            for(int i=length-2; i>=0;i--) {
                int temp=nums[i];
                nums[i+1]=temp;
            }
            nums[0]= lastElem;
            k--;
        }
    }
}
