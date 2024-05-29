import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            if(a>=1900){
                System.out.println("Division 1");
            }else if(a>=1600){
                System.out.println("Division 2");
            }else if(a>=1400){
                System.out.println("Division 3");
            }else{
                System.out.println("Division 4");
            }
        }
    }
}
