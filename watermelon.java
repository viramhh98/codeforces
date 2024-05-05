    import java.util.Scanner;

    public class watermelon {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int totalWeight = sc.nextInt();
            if (totalWeight % 2 == 0) {
                if (totalWeight == 2) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }

        }
    }

