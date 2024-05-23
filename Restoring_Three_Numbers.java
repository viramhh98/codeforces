import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long arr[]=new long[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        System.out.println((arr[3]-arr[0])+ " "+(arr[3]-arr[1]) + " "+(arr[3]-arr[2]) );
    }   
}
