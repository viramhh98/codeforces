import java.util.Scanner;

public class Problem_Generator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[7];
            String s=sc.next();
            for (int j = 0; j < s.length(); j++) {
                arr[s.charAt(j)-'A']+=1;
            }
            int ans=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]<m){
                    ans+=m-arr[j];
                }
            }
            System.out.println(ans);
        }
    }
}