import java.util.Scanner;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int ans=(a%10-1)*10;
            int j=1;
            while (a>0) {
                a/=10;
                ans+=j;
                j++;
            }
            System.out.println(ans);
        }
    }
}
