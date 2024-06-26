import java.util.Scanner;

public class Square_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            String s=sc.next();
            if(s.length()%2==0){
                int b=s.length()/2;
                int a=1;
                for (int j = 0; j <b; j++) {
                    if(s.charAt(j)!=s.charAt(j+b)){
                        System.out.println("NO");
                        a=0;
                        break;
                    }
                }if(a==1){
                    System.out.println("YES");
                }
            }else{
                System.out.println("NO");
            }
        }
    }
}
