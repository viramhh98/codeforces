import java.util.Scanner;

public class New_Year_Transportation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        long cell=sc.nextInt();
        int arr[]=new int[length];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int value=0;
        int index=1;
        while (value<=cell) {
            value=index+arr[index];
            if(value==cell){
                break;
            }
            index=value;
        }
        if(value==cell){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}