import java.util.Scanner;

public class Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int i=1;
        while (true) {
            n-=i*(i+1)/2;
            if(n>=0){
                ans++;
                i++;
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}
