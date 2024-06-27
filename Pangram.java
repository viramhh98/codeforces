import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="pangram";
        int arr[]=new int[26];
        int a=sc.nextInt();
        String q=sc.next().toLowerCase();
        for (int i = 0; i < q.length(); i++) {
            arr[q.charAt(i)-'a']=1;
        }
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                System.out.println("NO");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
    }
}
