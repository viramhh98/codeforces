import java.util.Scanner;

public class Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            long a=sc.nextLong();
            if(a==1){
                System.out.println(0);
            }
            else if(a%3==0){
                int count=0;
                myloop:while (true) {
                    count++;
                    if(a%6==0){
                        a/=6;
                    }else if(a%3==0){
                        a*=2;
                    }else{
                        count--;
                        break myloop;
                    }
                }
                if(a==1){
                    System.out.println(count);
                }else{
                    System.out.println(-1);
                }
            }else{
                System.out.println(-1);
            }
        }
    }
}
