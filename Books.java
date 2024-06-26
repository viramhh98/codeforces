import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        long time=sc.nextLong();
        int arr[]=new int[length+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=0;
        int count=0;
        int sum=0;
        int j=1;
        for(int i=1; i<arr.length;i++){
            if(sum+arr[i]<=time){
                sum+=arr[i];
                count++;
            }else{
                if(count>ans){
                    ans=count;
                }
                count++;
                sum+=arr[i];
                while(sum>=time){
                    sum-=arr[j];
                    j++;
                    count--;
                }
            }
        }
        if(count>ans){
            ans=count;
        }
        System.out.println(ans);
    }
}
