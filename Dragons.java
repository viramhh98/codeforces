import java.util.Scanner;

public class Dragons {

      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Energy=sc.nextInt();
        int test_case=sc.nextInt();
        int arr[][]=new int [test_case][2];
        for (int i = 0; i < test_case; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            flag=true;
            myloop:for (int j = 0; j < arr.length; j++) {
                if(Energy>arr[j][0] && arr[j][0]!=-1){
                    Energy+=arr[j][1];
                    arr[j][0]=-1;
                    flag=false;
                    break myloop;
                }
            }
            if(flag){
                break;
            }
            // System.out.println("hi");
        }
        if(flag){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}


// import java.util.Arrays;
// import java.util.Scanner;
 
// public class A230 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int initial=sc.nextInt();
//         int n=sc.nextInt();
//         int[][]arr=new int[n][2];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i][0]=sc.nextInt();
//             arr[i][1]=sc.nextInt();
//         }
//         sc.close();
//         Arrays.sort(arr,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
//         int i=0;
//         for ( i = 0; i < arr.length; i++) {
//             if(initial>arr[i][0]){
//                 initial+=arr[i][1];
//             }else{
//                 initial=-1;
//                 break;
//             }
//             // System.out.println(initial);
//         }
//         if(initial==-1){
//             System.out.println("NO");
//         }else{
//             System.out.println("YES");
//         }
//     }
 	