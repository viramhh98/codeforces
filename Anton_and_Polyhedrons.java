import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        int arr[]=new int[26];
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0; i<s; i++){
            arr[sc.next().charAt(0)-'A']+=1;
        }
        int ans=arr[2]*6+arr[3]*12+arr[19]*4+arr[14]*8+arr[8]*20;
        System.out.println(ans);
    }   
}
