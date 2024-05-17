import java.util.Scanner;

public class Kefa_and_First_Steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        int max = 0;
        Long min = Long.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] >= min) {
                count++;
                min = arr[i];
                max = Math.max(max, count);
            } else {
                min = arr[i];
                max = Math.max(max, count);
                count = 1;
            }
        }
        System.out.println(max);
    }
}
