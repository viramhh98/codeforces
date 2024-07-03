import java.util.Scanner;

public class Bachgold_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a/2);
            for (int i = 0; i < a/2; i++) {
                System.out.print(2+" ");
            }
        }else if(a>3){
            System.out.println(a/2);
            a-=3;
            for (int i = 0; i < a/2; i++) {
                System.out.print(2+ " ");
            }System.out.println(3);
        }else if(a==3){
            System.out.println(1);
            System.out.println(3);
        }
    }
}
