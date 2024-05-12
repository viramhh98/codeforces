import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int a,b,count=0;
        for(int i=0; i<length; i++){
            a=sc.nextInt();
            b=sc.nextInt();
            if(b-a>2){
                count++;
            }
        }
        System.out.println(count);
    }
}
