import java.util.Scanner;

public class YES_or_YES {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            String s=sc.next();
            if(s.toLowerCase().compareTo("yes")==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
   } 
}
