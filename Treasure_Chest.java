import java.util.Scanner;

public class Treasure_Chest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int chest_cord=sc.nextInt();
            int key_cord=sc.nextInt();
            int pickup_time=sc.nextInt();
            if(chest_cord<key_cord){
                if(chest_cord+pickup_time>=key_cord){
                    System.out.println(key_cord);
                }else{
                    int answer=(key_cord-chest_cord-pickup_time)*2+(chest_cord+pickup_time);
                    System.out.println(answer);
                }
            }else{
                int answer =chest_cord;
                System.out.println(answer);
            }
        }
    }
}
