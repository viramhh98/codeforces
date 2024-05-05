import java.util.Scanner;

public class Vasilije_in_Cacak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            long range=sc.nextLong();
            long integer_to_choose=sc.nextLong();
            long sum=sc.nextLong();
            long max=range*(range+1)-(range-integer_to_choose)*(range-integer_to_choose+1);
            long min=integer_to_choose*(integer_to_choose+1);
            if((min-sum*2)>0 ||sum*2-max>0 ){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        } 
    }
}