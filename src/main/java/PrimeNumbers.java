import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args){
        List<Integer> primeList=IntStream
                .rangeClosed(2,100)
                .filter(PrimeNumbers::isPrime)
                .boxed()
                .collect(Collectors.toList());
        primeList.stream().forEach(System.out::println);
    }

    private static boolean isPrime(int p) {
        return !IntStream.rangeClosed(2,p/2).anyMatch(i->p%i==0);
    }

}
