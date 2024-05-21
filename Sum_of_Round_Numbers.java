import java.util.Scanner;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int j = 0; j < test_case; j++) {
            int a=sc.nextInt();
            int arr[]=new int[5];
            arr[0]=a%10;
            arr[1]=(a%100-a%10);
            arr[2]=(a%1000-a%100);
            arr[3]=(a%10000-a%1000);
            arr[4]=(a%100000-a%10000);
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=0){
                    count++;
                }
            }
            System.out.println(count);
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=0){
                    System.out.print(arr[i]+ " ");
                }
            }
        }

    }
}


