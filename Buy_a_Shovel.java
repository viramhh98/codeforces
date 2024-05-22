import java.util.Scanner;

public class Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price=sc.nextInt();
        int coin=sc.nextInt();
        int count=0;
        while (true) {
            if((price*(count+1))%10==0 || (price*(count+1))%10==coin ){
                count++;
                break;
            }count++;
        }
        System.out.println(count);
    }
}
