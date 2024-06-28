import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int count=0;
        if(length>1){
            int a=sc.nextInt();
            int min=a;
            int max=a;
            for (int i = 1; i <length; i++) {
                a=sc.nextInt();
                if(a>max){
                    count++;
                    max=a;
                }else if(a<min){
                    count++;
                    min=a;
                }
            }
            System.out.println(count);
        }else{
            System.out.println(count);
        }
    }
}
