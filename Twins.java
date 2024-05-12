import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[101];
        int a,sum=0;
        for (int i = 0; i < length; i++) {
            a=sc.nextInt();
            arr[a]+=1;
            sum+=a;
        }
        // System.out.println(sum);
        int min=0;
        int sum2=((sum/2)+1);
        // System.out.println(sum2);
        for (int i = 100; i >= 0; ) {
            if(arr[i]!=0){
                if(sum2>0){
                    min+=1;
                    sum2-=i;
                    arr[i]-=1;
                }else{
                    break;
                }
                // System.out.println("helll00"+ i+ " "+sum2);
            }else{
                i--;
            }
        }
        System.out.println(min);
    }
}
