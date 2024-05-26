import java.util.Scanner;

public class Game_With_Sticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a%2==1 && b%2==1 )|| (Math.min(a, b)%2==1 && Math.max(a, b)%2==0) || a+b<=3){
            System.out.println("Akshat");
        }else{
            System.out.println("Malvika");
        }
    }
}
