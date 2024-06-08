import java.util.Scanner;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        int m=0;
        int c=0;
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                m++;
            }else if(a<b){
                c++;
            }
        }
        if(m==c){
            System.out.println("Friendship is magic!^^");
        }else if(m>c){
            System.out.println("Mishka");
        }else{
            System.out.println("Chris");
        }
    }   
}
