import java.util.Scanner;

public class My_First_Sorting_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int min=Math.min(x, y);
            int max=Math.max(x, y);
            System.out.println(min+ " "+max);
        }
    }
}
