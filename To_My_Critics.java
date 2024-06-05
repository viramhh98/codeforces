import java.util.Scanner;

public class To_My_Critics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=a+b+c;
            if(sum-a>=10){
                System.out.println("YES");
            }else if(sum-b>=10){
                System.out.println("YES");
            }else if(sum-c>=10){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
