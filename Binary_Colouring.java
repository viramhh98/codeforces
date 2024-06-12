import java.util.Scanner;

public class Binary_Colouring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int x = sc.nextInt();
            int bits = (int)(Math.log(x) / Math.log(2)) + 1;
            int more = bits + 1;
            int[] arr = new int[more];
            arr[more - 1] = 1;
            int diff = (int)Math.pow(2, bits) - x;
            
            while (diff != 0) {
                int highestBit = (int)(Math.log(diff) / Math.log(2));
                arr[highestBit] = -1;
                diff -= (int)Math.pow(2, highestBit);
            }
            
            System.out.println(arr.length);
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
