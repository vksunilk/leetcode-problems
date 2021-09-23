public class IsAnagram {
    public static void main(String[] args) {
        String s = "leetcode", t = "leeteodc";
        System.out.println(isAnagram(s,t));
    }
    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] slets = new int[26];
        for (char chs: s.toCharArray()) {
            System.out.println(chs - 'a');
            slets[chs - 'a'] ++;
        }
        for (char cht : t.toCharArray()) {
            if (slets[cht - 'a'] == 0) {
                return false;
            }
            slets[cht - 'a']--;
        }
        return true;
    }
}
