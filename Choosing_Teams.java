import java.util.Scanner;

public class Choosing_Teams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[6];
        for (int i = 0; i < n; i++) {
            arr[sc.nextInt()]++;
        }
        long ans=0;
        for (int i = 5-k; i >=0; i--) {
            ans+=arr[i];
        }
        System.out.println(ans/3);

    }
}
