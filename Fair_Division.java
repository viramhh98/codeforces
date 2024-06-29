import java.util.Scanner;

public class Fair_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int length=sc.nextInt();
            // int sum=0;
            int one=0;
            int two=0;
            for (int j = 0; j < length; j++) {
                int a=sc.nextInt();
                if(a==1){
                    one++;
                }else{
                    two++;
                }
            }
            if(two%2==1){
                one-=2;
                two++;
            }
            if(one%2==0 && two%2==0 && one>=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
