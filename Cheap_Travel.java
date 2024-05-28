import java.util.Scanner;

public class Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a*m<b){
            System.out.println(a*n);
        }else{
            if(n%m!=0){
                if((n%m)*a < b){
                    System.out.println((n/m)*b+ (n%m)*a);
                }else{
                    System.out.println(((n/m)+1)*b);
                }
            }else{
                System.out.println((n/m)*b);
            }
        }
    }
}
