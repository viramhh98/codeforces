import java.util.Scanner;

public class Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i <test_case; i++) {
            int length=sc.nextInt();
            String s=sc.next();
            int arr[]=new int[26];
            boolean flag=false;
            myloop:for (int j = 1; j <=s.length(); j++) {
                int a=s.charAt(j-1)-'A';
                if(arr[a]==0){
                    arr[a]=j;
                }else if(arr[a]+1==j){
                    arr[a]++;
                }else{
                    flag=true;
                    System.out.println("NO");
                    break myloop;
                }
            }
            if(flag==false){
                System.out.println("YES");
            }
        }
    }
}
