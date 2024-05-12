import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count=0;
        String a="",b="";
        for (int i = 0; i < length; i++) {
            a=sc.next();
            if(a.compareTo(b)==0){

            }else{
                count++;
            }
            b=a;
        }
        System.out.println(count);
    }
    
}
