public class RomanToInt {
    public static void main(String[] args) {
        String S = "MCMXCIV";
        int ans = 0, num = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            char c=S.charAt(i);
            switch(c) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (2 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }
        }
        System.out.println(ans);
    }
}
