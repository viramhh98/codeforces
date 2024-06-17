import java.util.Scanner;

public class Plus_One_on_the_Subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int length=sc.nextInt();
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < length; j++) {
                int a=sc.nextInt();
                if(a<min){
                    min=a;
                }
                if(a>max){
                    max=a;
                }
            }
            System.out.println(max-min);
        }
    }
}
