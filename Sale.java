import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tv=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[tv];
        int count=0;
        for (int i = 0; i < tv; i++) {
            int a=sc.nextInt();
            if(a<0){
                arr[count]=a*-1;
                count++;
            }
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<m;i++){
            ans+=arr[arr.length-i-1];
        }
        System.out.println(ans);
    }
}
