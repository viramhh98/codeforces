import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question=sc.next();
        long count=0;
        for(int i=0; i<question.length(); i++){
            if(question.charAt(i)=='4'|| question.charAt(i)=='7'){
                count++;
                if(count>7){
                    break;
                }
            }
            
        }
        // System.out.println(flag+" " +flag1+flag2);
        if(count==4 || count== 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
