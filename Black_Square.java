import java.util.Scanner;

public class Black_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        String s=sc.next();
        long ans=0;
        for (int i = 0; i < s.length(); i++) {
            ans+=arr[s.charAt(i)-'0'];
        }
        System.out.println(ans);
    }
}
