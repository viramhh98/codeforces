import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        int odd=0;
        int even=0;
        for (int i = 0; i <test_case; i++) {
            int length=sc.nextInt();
            for (int j = 0; j < length; j++) {
                int a=sc.nextInt();
                if(a%2!=j%2){
                    if(j%2==0){
                        odd++;
                    }else{
                        even++;
                    }
                }
            } if(even==odd){
                System.out.print(even);
            }else{
                System.out.print(-1);
            }System.out.println();
        }
       
    }
}
