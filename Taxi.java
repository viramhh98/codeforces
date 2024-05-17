import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int length=sc.nextInt();
        int ans=0;
        for(int i=0; i<length; i++){
            arr[sc.nextInt()]++;
        }
        ans+=arr[4];
        ans+=(int)(arr[2]/2);
        if(arr[2]%2==0){
            arr[2]=0;
        }else{
            arr[2]=1;
        }
        if(arr[3]==arr[1]){
            ans+=arr[3]+arr[2];
        }else if(arr[3]>arr[1]){
            ans+=arr[1];
            arr[3]-=arr[1];
            ans+=arr[3]+arr[2];
        }else{
            ans+=arr[3];
            arr[1]-=arr[3];
            if(arr[2]==1 ){
                ans+=1;
                arr[2]=0;
                arr[1]-=2;
            }
            if(arr[1]>0){
                ans+=(int)(arr[1]/4);
                if(arr[1]%4!=0){
                    ans+=1;
                }
            }
        }
        System.out.println(ans);
        // System.out.print(AK[4] +AK[3] +(Math.max(0,AK[1]-AK[3])+AK[2]*2 +3)/4);
    }
}
