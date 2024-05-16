import java.util.Scanner;

public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long amt=sc.nextLong();
        long ans=0;
        ans+=amt/100;
        amt=amt%100;
        ans+=amt/20;
        amt=amt%20;
        ans+=amt/10;
        amt=amt%10;
        ans+=amt/5;
        amt=amt%5;
        ans+=amt;
        System.out.println(ans);
        
    }
}
