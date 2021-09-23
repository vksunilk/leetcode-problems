public class MatchingNumbers {
//Note: If 2 values are same or there are only 1 difference between 2 values,
// we should consider that as a match. More than one difference we should not consider it as match.
    public static void main(String... args) {
        byte[] input = new byte[]{100, 110, 111, 101, 100};
        //Output: [2, 3, 2, 1, 2]
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = input.length-1; j >=0 ; j--) {
                if(i == j) {
                    continue;
                }
                if(input[i] == input[j] || matchByDiffOne(input, i, j)) {
                    output[i] = output[i]+1;
                }
            }
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }

    }

    private static boolean matchByDiffOne(byte[] input, int i, int j) {
        String[] iString = String.valueOf(input[i]).split("");
        String[] jString = String.valueOf(input[j]).split("");
        int counter = 0;
        for (int k = 0; k < iString.length; k++) {
            if(!iString[k].equals(jString[k])){
                counter++;
            }
            if(counter>1) {
                return false;
            }
        }
        return true;
    }

}
