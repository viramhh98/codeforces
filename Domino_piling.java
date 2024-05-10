import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int answer=Math.floorDiv((m*n), 2);
        System.out.println(answer);
    }
}
