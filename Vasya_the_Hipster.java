import java.util.Scanner;

public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int red=sc.nextInt();
        int blue=sc.nextInt();
        System.out.println(Math.min(red, blue)+ " "+ (int)((Math.max(red, blue)-Math.min(red, blue))/2));
    }
}
