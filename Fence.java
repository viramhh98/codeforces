import java.util.Scanner;

public class Fence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int cons=sc.nextInt();
        int arr[]=new int[length+1];

        for (int i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt()+arr[i-1];
        }
        int min=Integer.MAX_VALUE;
        int index=-1;
        for (int i = cons; i < arr.length; i++) {
            int d=arr[i]-arr[i-cons];
            if(d<min){
                min=d;
                index=i-cons+1;
            }
        }
        System.out.println(index);
    }
}