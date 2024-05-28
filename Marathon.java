import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a=sc.nextInt();
            int count=0;
            count =(sc.nextInt()- a)>0 ? count+=1 : count;
            count =(sc.nextInt()- a)>0 ? count+=1 : count;
            count =(sc.nextInt()- a)>0 ? count+=1 : count;
            System.out.println(count);
        }
    }
}
