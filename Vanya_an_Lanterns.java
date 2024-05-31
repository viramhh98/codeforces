import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Vanya_an_Lanterns{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no_lanterns=sc.nextInt();
        int length=sc.nextInt();
        int arr[]=new int[no_lanterns];
        for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        double max=Double.MIN_VALUE;
        if(arr[0]!=0){
            max=arr[0];
        }
        for (int i = 1; i < arr.length; i++) {
            if(max<((double)(arr[i]-arr[i-1]))/2 && (arr[i]-arr[i-1])!=0){
                max=((double)(arr[i]-arr[i-1]))/2;
            }
        }

        if(length-arr[arr.length-1]!=0){
            if(max<length-arr[arr.length-1]){
                max=length-arr[arr.length-1];

            }
        }
        System.out.println(max);
    }
}