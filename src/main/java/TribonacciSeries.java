public class TribonacciSeries {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(25));
    }
    public static int tribonacci(int n) {
        int[] trib = new int[n+1];
        trib[0]=0;
        trib[1]=1;
        trib[2]=1;
        if(n<=3)return trib[n];
        for(int i=3;i<=n;i++){
            trib[i]=trib[i-1]+trib[i-2]+trib[i-3];
        }
        return trib[n];
    }
}
