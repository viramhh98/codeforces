import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[2]-arr[0]);
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // System.out.println(Math.max(Math.max(a, b),c)-Math.min(Math.min(a, b),c));
    }
}
