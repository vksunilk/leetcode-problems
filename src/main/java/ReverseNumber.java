public class ReverseNumber {
    public static void main(String... args) {
        System.out.println(reverse(1534236469));
//        Integer.v
    }
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0)
        {
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE )
            {
                return 0;
            }

            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans;
    }
}
