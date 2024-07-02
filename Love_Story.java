import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        String q="codeforces";
        for (int i = 0; i < test_case; i++) {
            String s=sc.next();
            int count=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)!=q.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
