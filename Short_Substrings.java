import java.util.*;

public class Short_`Substrings {
    static Scanner cl = new Scanner(System.in);

    public static void main(String[] args) {
        int t = cl.nextInt();
        while (t-- > 0) {
            String a;
            a = cl.next();
            int len = a.length();
            System.out.print(a.charAt(0));
            for (int i = 1; i < len - 1; i += 2) {
                System.out.print(a.charAt(i));
            }
            System.out.println(a.charAt(len - 1));
        }
    }
}