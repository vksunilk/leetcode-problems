public class ShiftingStrings {
    public static void main(String[] args) {
        String s= "abcde";
        System.out.println(shiftString(s,1,1));
    }
    public static String shiftString(String s, int leftShift, int rightShift){
        s = leftrotate(s, leftShift%s.length());
        s = rightrotate(s, rightShift%s.length());
        return s;
    }
    static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }
    static String rightrotate(String str, int d)
    {
        return leftrotate(str, str.length() - d);
    }
}
