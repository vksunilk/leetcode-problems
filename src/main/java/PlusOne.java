public class PlusOne {
    public static void main(String[] args) {
        int[] digits={8,9};
        System.out.println(plusOne(digits));

    }
    public static int[] plusOne(int[] digits) {
//        String numStr="";
//        for(int i: digits) {
//            numStr+=i;
//        }
//        long num= Long.valueOf(numStr);
//        num+=1;
//        System.out.println(num);
//        int[] output=new int[(num+"").length()];
//        for(int i=output.length-1;i>=0;i--){
//            int rem=Long.valueOf(num % 10).intValue();
//            output[i]=rem;
//            num/=10;
//            System.out.println(num);
//        }
//        // digits[digits.length-1]=digits[digits.length-1]+1;
//        return output;

        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
