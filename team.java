import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        int answer=0;
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b+c>=2){
                answer+=1;
            }
        }
        System.out.println(answer);
    }
}
