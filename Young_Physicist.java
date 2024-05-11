import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int arr[][]=new int[rows][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean flag=true;
        for(int i=0; i<arr[0].length; i++){
           int sum=0;
           for(int j=0; j<rows; j++){
                sum+=arr[j][i];
           }
           if(sum==0){
                
           }else{
                flag=false;
                break;
           }
        }if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
