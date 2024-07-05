import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class  Fair_Playoff{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int arr[]=new int[4];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            int a=Math.max(arr[0], arr[1]);
            int b=Math.max(arr[2], arr[3]);
            Arrays.sort(arr);
            if(a==arr[2]|| a==arr[3]){
                if(b==arr[2]|| b==arr[3]){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
    }
}