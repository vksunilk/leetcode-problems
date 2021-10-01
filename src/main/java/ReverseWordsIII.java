//Given a string s, reverse the order of characters in each word within a sentence
// while still preserving whitespace and initial word order.
public class ReverseWordsIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] spaceSplit = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < spaceSplit.length; i++) {
            sb.append(reverse(spaceSplit[i]));
            if(i!=spaceSplit.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static String reverse(String s) {
        char[] ch = s.toCharArray();
        int i=0,j= ch.length-1;
        while(i<j){
            char c = ch[i];
            ch[i]=ch[j];
            ch[j]= c;
            i++;
            j--;
        }
       return new String(ch);
    }
}
