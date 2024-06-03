import java.util.Scanner;

public class Not_Divisible_by_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(k+Math.abs((k-1)/(n-1)));
        }
    }
}
