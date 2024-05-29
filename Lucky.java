import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            String q=sc.next();
            if(q.charAt(0)+q.charAt(1)+q.charAt(2)==q.charAt(3)+q.charAt(4)+q.charAt(5)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
