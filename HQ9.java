import java.util.Scanner;

public class HQ9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String question=sc.next();
        boolean flag=true;
        for (int i = 0; i < question.length(); i++) {
            if(question.charAt(i)=='H'||question.charAt(i)=='Q'||question.charAt(i)=='9'){
                System.out.println("YES");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("NO");
        }
    }
}
