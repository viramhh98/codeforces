import java.util.Scanner;

public class Odd_One_Out {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==b){
                System.out.println(c);
            }else if(b==c){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }
    }
}
