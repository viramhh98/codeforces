import java.util.Scanner;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int arr[]=new int[test_case];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < test_case; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        long ans=0;
        for (int i = 0; i < test_case; i++) {
            ans+=max-arr[i];
        }
        System.out.println(ans);
    }
}
