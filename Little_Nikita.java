import java.util.Scanner;

public class Little_Nikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n<m){
                System.out.println("NO");
            }else{
                if((n-m)%2==0){
                    System.out.println("YES");
                }else{
                System.out.println("NO");

                }
            }
        }
    }

}