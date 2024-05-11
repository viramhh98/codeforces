import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stops=sc.nextInt();
        int arr[][]=new int[stops][2];
        int max=0;
        int present=0;
        for(int i=0; i<arr.length; i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
                present=present-arr[i][0]+arr[i][1];
                if(present>max){
                    max=present;
                }  
        }
        System.out.println(max);
    }
}
