import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 1;
        if(a==1 && b==1 && c==1){
            ans=3;
        }else if(a==b && a==c){
            ans=a*a*a;
        }
        else if (c >= a && c >= b) {
            if(a==1 || b==1){
                if (a == 1 && b == 1) {
                    ans = c*2;
                } else if (a == 1) {
                    ans = (1+b)*c;
                } else {
                    ans = (1+a)*c;
                }
            }else{
                ans = (a * b) * c;
            }
        } else if (b >= c && b >= a) {
            ans = b;
            if (c == 1 || a == 1) {
                if (c == 1 && a == 1) {
                    ans = b+2;
                } else if (c == 1) {
                    ans = (a)*(b+1);
                } else {
                    ans = (c)*(b+1);
                }
            } else {
                ans=a*b*c;
            }
        }else{
            if(b==1 || c==1){
                if (b == 1 && c == 1) {
                    ans = a*2;
                } else if (b == 1) {
                    ans = (c+1)*a;
                } else {
                    ans = (b+1)*a;
                }
            }else{
                ans = (a * b) * c;
            }
        }
        System.out.println(ans);
    }
}
