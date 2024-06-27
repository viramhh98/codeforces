import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int ans=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
