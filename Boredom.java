import java.util.Scanner;

public class Boredom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        long odd=0;
        long even=0;
        for (int i = 0; i <length; i++) {
            if(i%2==0){
                odd+=sc.nextInt();
            }else{
                even+=sc.nextInt();
            }
        }
        System.out.println(Math.max(odd,even));
    }
}
