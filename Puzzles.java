import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n_students=sc.nextInt();
        int m_sequence=sc.nextInt();
        int arr[]=new int[m_sequence];
        for (int i = 0; i < m_sequence; i++) {
            int a=sc.nextInt();
            arr[i]=a;
        }
        Arrays.sort(arr);
        // for (int i = 0; i < m_sequence; i++) {
          
        //     System.out.print(arr[i]+ " ");
        // }
        int min=Integer.MAX_VALUE;
        for (int i = n_students-1; i < arr.length; i++) {
            int a=arr[i]-arr[i-n_students+1];
            if(a<min){
                min=a;
            }
        }
        System.out.println(min);
        // int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c=Integer.MAX_VALUE;
        // int z=n_students;
        // int i=0;
        // for (i = max; (z>0 && i < arr.length); i++) {
        //     z-=arr[i];
        // }
        // if(z<=0){
        //     a=Math.abs(i-max-1);
        // }

        // z=n_students;
        // i=0;
        // for (i = max; (z>0 && i < arr.length); i--) {
        //     z-=arr[i];
        // }
        // if(z<=0){
        //     b=Math.abs(max-i-1);
        // }

        
        // z=n_students;
        // i=0;
        // int j=max;
        // int max1=0;
        // int min=0;
        // for (i = max; (z>0 && --j>=0 && i < arr.length); i++) {
        //     min=Math.min(arr[i], arr[j]);
        //     max1=Math.max(arr[i], arr[j]);
        //     z-=max1;
        //     if(z>0){
        //         z-=min;
        //     }else{
        //         break;
        //     }
        // }
        // if(z<=0){
        //     c=Math.abs(i-j+1);
        // }
        // // System.out.println(c);


        // System.out.println(Math.min(Math.min(a, b), c));


    }
}
