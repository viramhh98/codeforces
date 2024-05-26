import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {

            long a=sc.nextInt();
            long b=sc.nextInt();
            long temp=a;
            long temp1=b;
            a=Math.min(temp,temp1);
            b=Math.max(temp, temp1);
            if(b%10==a%10){
                System.out.println((long)b/10-(long)a/10);
            }else if(b%10<a%10){
                System.out.println((long)b/10-(long)a/10);
            }else{
                System.out.println((long)b/10-(long)a/10 +1 );
            }
        }
        
    }
}
