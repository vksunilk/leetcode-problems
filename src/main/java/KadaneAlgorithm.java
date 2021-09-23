public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] array={3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
        System.out.println(kadanesAlgo(array));
    }
    private static int kadanesAlgo(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            maxEndingHere = Math.max(num, maxEndingHere+num);
            maxSoFar =  Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
