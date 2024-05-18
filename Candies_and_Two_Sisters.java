import java.util.Scanner;

public class Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            long a=sc.nextLong();
            if(a%2==0){
                System.out.println((a-1)/2);
            }else{
                System.out.println(a/2);
            }
        }
    }
}
