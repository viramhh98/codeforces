import java.util.Scanner;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(); 
        long ans=0;
        int i=0;
        while(i!=a.length()){
            long d=Integer.parseInt(""+ a.charAt(i));
            int c= Math.min((int)d,(int)(9-d));
            if(i==0){
                if(c==0){
                    c=Integer.parseInt(""+a.charAt(i));
                }
            }
            ans=ans*10+c;
            i++;
        }
        System.out.println(ans);
    }
}
