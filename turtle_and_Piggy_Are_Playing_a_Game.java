import java.util.Scanner;

public class turtle_and_Piggy_Are_Playing_a_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            System.out.println((int) (Math.log(b) / Math.log(2)));
  
        }
    }
}
