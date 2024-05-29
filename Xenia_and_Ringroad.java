import java.util.Scanner;

public class Xenia_and_Ringroad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt()-1;
        int m=sc.nextInt();
        long ans=0;
        int prev=0;
        for (int i = 0; i < m; i++) {
            int a=sc.nextInt()-1;
            // System.out.println(a+ " "+ prev+ " "+ans+ " initial");
            if(a>=prev){
                ans+=a-prev;
                prev=a;
            }else{
                ans+=n-prev+a+1;
                prev=a;
            }
            // System.out.println(a+ " "+ prev+ " "+ans+ " final");



        }
        System.out.println(ans);
    }
}
