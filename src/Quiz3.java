import java.lang.reflect.Array;
import java.util.Arrays;

public class Quiz3 {

    public static void func(int n){

        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<n; i++){

           arr[i] = arr[i-1]+arr[i-2];
        }

        System.out.println((arr[n-2]+arr[n-1])%1234567);


    }
    public static void main(String[] args) {
        func(3);
        func(5);
    }
}
