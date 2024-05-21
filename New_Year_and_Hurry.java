import java.util.Scanner;

public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=240-sc.nextInt();
        while ((n*(n+1)/2)*5>min) {
                n--;
        }
        System.out.println(n);
    }
}
