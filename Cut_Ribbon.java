import java.util.Scanner;
 
public class  Cut_Ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println(solveDP(n, a, b, c));
    }
    
    private static int solveDP(int n, int a, int b, int c) {
        // set up dp array
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MIN_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i - a >= 0) { 
                dp[i] = Math.max(dp[i], dp[i - a] + 1);
            }
            if (i - b >= 0) {
                dp[i] = Math.max(dp[i], dp[i - b] + 1);
            }
            if (i - c >= 0) {
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
            }
        }
        return dp[n];
    }
}