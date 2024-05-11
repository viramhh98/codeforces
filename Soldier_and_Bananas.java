import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost=sc.nextInt();
        long money=sc.nextLong();
        int wants=sc.nextInt();
        long answer=(cost*wants*(wants+1))/2-money;
        if(answer<=0){
            System.out.println("0");
        }else{
            System.out.println(answer);
        }
    }
}
