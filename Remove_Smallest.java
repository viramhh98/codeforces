import java.util.Arrays;
import java.util.Scanner;

public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int length = sc.nextInt();
            int arr[] = new int[length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean possible = true;
            for (int j = 0; j <length - 1; j++) {
                if (arr[j + 1] - arr[j] > 1) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }
}
}