import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int remainder = a % b; // Calculate remainder when a is divided by b

            // If remainder is 0, a is already divisible by b
            // Otherwise, we need to make a divisible by b by increasing it by (b - remainder) steps
            int moves = (remainder == 0) ? 0 : (b - remainder);
            
            System.out.println(moves);
        }
    }
}
