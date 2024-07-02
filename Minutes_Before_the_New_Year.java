import java.util.Scanner;

public class Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        int d=24;
        int c=60;
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println((d-a-1)*60+(c-b));
        }
    }
}
