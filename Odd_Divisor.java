import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        long n;
        for (int i = 0; i < t; i++) {
            n = sc.nextLong();
            if ((n & (n - 1)) == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}