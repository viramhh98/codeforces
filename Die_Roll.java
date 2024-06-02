import java.util.Scanner;

public class Die_Roll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=7-Math.max(a, b);
        int d=6;
        while (true) {
            if(c%3==0 && d%3==0){
                c/=3;
                d/=3;
            }else if(c%2==0 && d%2==0){
                c/=2;
                d/=2;
            }else{
                break;
            }
        }
        System.out.println(c+"/"+d);
    }
}
