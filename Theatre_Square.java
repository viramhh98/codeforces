import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long Theatre_Square_length=sc.nextInt();
        long Theatre_Square_bredth=sc.nextInt();
        long flagstone_length=sc.nextInt();
        long length_wise_flagstone=Math.ceilDiv(Theatre_Square_length, flagstone_length);
        long bredth_wise_flagstone=Math.ceilDiv(Theatre_Square_bredth, flagstone_length);
        System.out.println(length_wise_flagstone*bredth_wise_flagstone);
    }   
}
