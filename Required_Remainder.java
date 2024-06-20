import java.util.Scanner;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
            double k = (n - y) % x;
            System.out.println((long)(n - k));

        }
    }
}
