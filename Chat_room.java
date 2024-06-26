import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=-1;
        boolean flag=true;
        String ans="helloa";
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==ans.charAt(j)){
                j++;
                if(j==5){
                    break;
                }
            }
        }
        if(j==5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
