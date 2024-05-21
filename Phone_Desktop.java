import java.util.Scanner;

public class Phone_Desktop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int screen= Math.ceilDiv(y, 2);
            if(y==0){
                System.out.println(x%15==0 ? x/15 : (x/15)+1);
            }
            else if(y%2==0){
                if(x/7<screen ){
                    System.out.println(screen);
                }else{
                    x=x-screen*7;
                    x=x%15==0 ? x/15 : (x/15)+1;
                    screen+=x;
                    System.out.println(screen);
                }
            }else{
                if(x/7<screen){
                    System.out.println(screen);
                }else{
                    x=x-(screen-1)*7;
                    x-=11;
                    if(x>0){
                        x=x%15==0 ? x/15 : (x/15)+1;
                        screen+=x;
                    }
                    System.out.println(screen);
                }
            }
        }
    }
}