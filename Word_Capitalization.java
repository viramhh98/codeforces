import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String left=(String) a.subSequence(1, a.length());
        String b=a.charAt(0)+"";
        System.out.println(b.toUpperCase()+left);      
    }
}
