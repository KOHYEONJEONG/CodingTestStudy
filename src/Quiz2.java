import java.util.Arrays;

public class Quiz2 {

    public static String Solution(String s){

        String result = "";

        String[] arr = s.split(" ");
        int[] intArray = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .toArray();

        int max,min;
        max = min = intArray[0];

        for (int i : intArray){
            if (max<i){
                max = i;
            }
            if(min>i){
                min = i;
            }
        }

        result = min+" "+max;

        //Math.max(Instr);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Solution("1 2 3 4"));
        System.out.println(Solution("-1 -2 -3 -4"));
    }
}
