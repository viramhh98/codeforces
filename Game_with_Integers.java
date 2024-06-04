import java.util.Scanner;

public class Game_with_Integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_Case=sc.nextInt();
        for (int i = 0; i < test_Case; i++) {
            int a=sc.nextInt();
            boolean flag=false;
            if((a-1)%3==0||(a+1)%3==0){
                flag=true;
            }
            if(flag){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}
