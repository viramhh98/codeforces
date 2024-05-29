import java.util.Scanner;

public class Plus_or_Minus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
                sc.nextInt();
            int c=sc.nextInt();
            if(a>c){
                System.out.println("-");
            }else{
                System.out.println("+");
            }
        }
    }
}
