import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new  int[]{4,7,44,47,74,77,474,477,744,747};
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>n){
                break;
            }
            if(n%arr[i]==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
