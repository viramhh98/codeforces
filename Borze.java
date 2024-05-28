import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String q=sc.next();
        String ans="";
        for (int i = 0; i < q.length(); i++) {
            if(q.charAt(i)=='.'){
                ans+="0";
            }else{
                if(q.charAt(i+1)=='.'){
                    ans+="1";
                }else{
                    ans+="2";
                }i++;
            }
        }
        System.out.println(ans);
    }
}
