import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coordinates = sc.nextInt();
        if (coordinates % 5 == 0) {
            int answer = Math.floorDiv(coordinates, 5);
            System.out.println(answer);
        }else{
            int answer = Math.floorDiv(coordinates, 5) + 1;
            System.out.println(answer);
        }
    }
}
