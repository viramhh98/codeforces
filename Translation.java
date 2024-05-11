import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c="";
        for(int i=b.length()-1; i>=0; i--){
            c+=b.charAt(i);
        }
       if(a.compareTo(c)==0){
        System.out.println("YES");
       }else{
        System.out.println("NO");
       }
    }
}
