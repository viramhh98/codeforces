import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean flag=false;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==b.charAt(i)){
                
            }else if(a.charAt(i)<b.charAt(i)){
                System.out.println("-1");
                flag=true;
                break;
            }else{
                System.out.println("1");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("0");
        }

    }
}
