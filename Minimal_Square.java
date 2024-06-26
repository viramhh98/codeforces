import java.util.Scanner;

public class Minimal_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=Math.min(a, b);
            int d=Math.max(a, b);
            if(c*2<d){
                System.out.println(d*d);
            }else{
                System.out.println(c*(c*4));
            }
        }
    }   
}
