import java.util.Arrays;
import java.util.Scanner;

public class Two_Arrays_And_Swaps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int n=sc.nextInt();
            int swap=sc.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[n];
            int sum=0;
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            for (int j = 0; j < brr.length; j++) {
                brr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(brr);
            for (int j = 0; j < swap; j++) {
                if(arr[j]<brr[brr.length-j-1]){
                    sum-=arr[j];
                    sum+=brr[brr.length-j-1];
                }else{
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
