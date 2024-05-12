import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt()+1;
        int arr[]=new int[length];
        int ans[]=new int[length];
        for(int i=1; i<length;i++){
            arr[i]=sc.nextInt();
            ans[arr[i]]=i;  
        }
        for (int j = 1; j < ans.length; j++) {
            System.out.print(ans[j]+" ");
       }
       
    }
}
