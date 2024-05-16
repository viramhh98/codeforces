import java.util.Scanner;

public class problem144A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        int max=0;
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>arr[max]){
                max=i;
            }else if(arr[i]<=arr[min]){
                min=i;
            }
        }
        // System.out.println(max);
        // System.out.println(min);
        // System.out.println(arr.length);
        if(max<min){
            System.out.println(max+arr.length-(min+1));
        }else{
            System.out.println(max+arr.length-(min+1+1));
        }
    }
}