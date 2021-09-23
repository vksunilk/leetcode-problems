public class LeetCode {

    public static void main(String... args) {
        int[] a = new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] b = new int[]{2,5,6};
        int n =3;
        merge(a,m,b,n);
    }

    public static void merge(int[] a, int m, int[] b, int n) {
        if(m==0) {
            a = b;
            return;
        }
        int[] output = new int[a.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            output[k++] = a[i]<b[j] && a[i] != 0 ? a[i++] : b[j++];
            System.out.print(output[k-1]);
//            System.arraycopy();
        }
//        while(k<a.length){
//            output[k++]=a[i++];
//        }
//        while(j<b.length){
//            output[k++]=b[j++];
//        }
        a = output;
    }
}
