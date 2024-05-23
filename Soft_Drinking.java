import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arrp[]=new int[8];
        for (int i = 0; i < arrp.length; i++) {
                arrp[i]=sc.nextInt();
        }
        System.out.println((Math.min((Math.min(((arrp[1]*arrp[2])/arrp[6]),arrp[3]*arrp[4])), arrp[5]/arrp[7]))/arrp[0]);
    }   
}
