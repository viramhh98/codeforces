import java.util.Scanner;

public class Raising_Bacteria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long ans=0;
        while (a>0) {
            if(a%2==0){
                a=a/2;
            }else{
                a/=2;
                ans++;
            }
        }
        System.out.println(ans);

    }
}
