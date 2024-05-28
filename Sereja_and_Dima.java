import java.util.Scanner;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        int a=0;
        int b=0;
        int point1=0;
        int point2=arr.length-1;
        for (int i = 0; i < length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; point1<=point2; i++) {
            if(arr[point1]>=arr[point2]){
                a+=arr[point1];
                point1++;
            }else{
                a+=arr[point2];
                point2--;
            }
            if(point1<=point2){
                if(arr[point1]>=arr[point2]){
                    b+=arr[point1];
                    point1++;
                }else{
                    b+=arr[point2];
                    point2--;
                }
            }
        }
        System.out.println(a +" "+b);
    }   
}
