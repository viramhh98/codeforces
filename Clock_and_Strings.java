import java.util.Scanner;

public class Clock_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int min=Math.min(a, b);
            int max=Math.max(a, b);
            int arr[]=new int[max-min+1];
            boolean flag1=false;
            boolean flag2=false;
            for(int j=0; j<arr.length; j++){
                arr[j]=min+j;
                if(arr[j]==c){
                    flag1=true;
                }if(arr[j]==d){
                    flag2=true;
                }
            }
            if((flag1 && flag2) || (!flag1 && !flag2)){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}
