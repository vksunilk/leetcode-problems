import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BuildNumber {
    public static void main(String[] args){
        List<Integer> inputList=new ArrayList<>();
        inputList.add(8);
        inputList.add(7);
        inputList.add(1);
        int higherBound=200;
        int num = getNumber(inputList,higherBound);
        System.out.println(num);

    }

    private static int getNumber(List<Integer> inputList,int higherBound) {
        int num= 0;
        Collections.sort(inputList); //178
        String hbs= String.valueOf(higherBound); //200

        for(int i=0;i<hbs.length();i++){

        }
        int dig1 = (int)(hbs.charAt(0)); //2
        int dig2 = (int)(hbs.charAt(1));  //0
        int dig3 = (int)(hbs.charAt(2)); //0
        for(int i: inputList) {
            if(dig1>i) {
                num=i*(10^inputList.size());
            }
        }


        for(int i = inputList.size()-1; i>=0; i--){
            num=num*10 + inputList.get(i);
        }

        if(num >higherBound){

        }
        return num;
    }

}
