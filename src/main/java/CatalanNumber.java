public class CatalanNumber {
    public static void main(String[] args) {
        System.out.println(catalanNumber(4));
        System.out.println(catalanNumber(25));
    }
    public static int catalanNumber(int n) {
        int[] catalnNo = new int[n+1];
        catalnNo[0]=0;
        catalnNo[1]=1;
        catalnNo[2]=1;
        if(n<=3)return catalnNo[n];
        for(int i=3;i<=n;i++){
//            catalnNo[i]+=catalnNo[i-1]* catalnNo[i - j - 1];;
        }
        return catalnNo[n];
    }
}
