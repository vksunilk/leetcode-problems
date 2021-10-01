public class AddTwoNumbersWithoutPlus {
    public static void main(String[] args) {
        System.out.println(add(3,5));
    }
    static int add(int a, int b) {
        while(b!=0) {
            int sum = a^b;
            int carry=(a&b)<<1;
            a=sum;
            b=carry;
        }
        return a;
    }
}
