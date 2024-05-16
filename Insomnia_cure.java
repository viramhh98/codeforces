import java.util.Scanner;

public class Insomnia_cure {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        long e=sc.nextLong();
        long ans=0;
        for (int i = 1; i <= e ; i++) {
                if(i%a==0 || i%b==0 || i%c==0|| i%d==0){
                    ans+=1;
                }
        }
        System.out.println(ans);
    }
}