import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long value=sc.nextLong();
        int times=sc.nextInt();
        while (times-->0) {
            if(value%10==0){
                value/=10;
            }else{
                value-=1;
            }
        }
        System.out.println(value);
    }
}
