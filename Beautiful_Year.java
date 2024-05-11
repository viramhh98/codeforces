import java.util.Scanner;
public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt()+1;
        int a,b,c,d=0;
        while (true) {
             d=year%10;
             c=(int)(year%100)/10;
             b=(int)((year%1000))/100;
             a=(int)((year%10000)/1000);
            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                break;
            }year+=1;
        }
        System.out.println(a+""+ b+ ""+c+""+d);

      
    }
}
