import java.util.Scanner;

public class Polycarp_and_Coins {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int b=a/3;
            int c=a/3;
            if(a%3==1){
                b++;
            }else if(a%3==2){
                c++;
            }
            System.out.println(b+" "+ c);
        }
    }   
}
