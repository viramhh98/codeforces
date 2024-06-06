import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Choosing_Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int length=sc.nextInt();
            int fav=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[length+1];
            for (int j = 1; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            fav=arr[fav];
            Arrays.sort(arr);
            boolean flag1=false;
            if((arr.length-k-1)>=0 && arr[arr.length-k-1]==fav){
                flag1=true;
            }
            boolean flag2=false;
            myloop: for (int j = arr.length-k; j < arr.length; j++) {
                if(arr[j]==fav){
                    flag2=true;
                }
                if(arr[j]>fav){
                    break myloop;
                }
            }
            if(flag1 && flag2){
                System.out.println("MAYBE");
            }else if(!flag1 && flag2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
