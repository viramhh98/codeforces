import java.util.Scanner;

public class Panoramixs_Prediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean flag=false;
        boolean flag1=false;
        for (int i = a+1; i <=b; i++) {
            flag=false;
            myloop:for (int j = 2; j <=i/2 ; j++) {
                if(i%j==0){
                    flag=true;
                    break myloop;
                }
            }
            if(flag){

            }else{
                flag1=true;
                if(i==b){
                    System.out.println("YES");
                    flag=false;
                }else{
                    System.out.println("NO");
                }
                break;
            }
        }
        if(flag1==false){
            System.out.println("NO");
        }
    }
}
