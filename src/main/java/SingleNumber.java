import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] a  ={2,1,4,5,2,4,1};
        int result = 0;
        for (int i = 0; i<a.length; i++)
        {
            result ^=a[i];
        }
        System.out.println(result);
        System.out.println(1^1);
        System.out.println(2^1);
        System.out.println(4^2);
        System.out.println(7^3);
    }
}
