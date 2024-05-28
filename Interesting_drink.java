// import java.lang.reflect.Array;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Interesting_drink {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int No_shops = sc.nextInt();
//         int arr[] = new int[No_shops];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int output = sc.nextInt();
//         Arrays.sort(arr);
//         for (int i = 0; i < output; i++) {
//             int a = sc.nextInt();
//             int low = 0;
//             int high = arr.length;
//             int index = (low + high) / 2;
//             myloop: while (true) {
//                 System.out.println(index);
//                 if (arr[index] > a) {
//                     high = index;
//                     index = (low + high) / 2;
//                 } else {
//                     low=index;
//                     index =  (low+ high) / 2;
//                 }

//                 if (arr[index] == a) {
//                     System.out.println(index + 1);
//                     break myloop;
//                 } else {
//                     if (index - 1 >= 0 && index + 1 < arr.length) {
//                         if (arr[index - 1] > a && arr[index + 1] < a) {
//                             System.out.println(index + 1);
//                             break myloop;
//                         }
//                     } else if(index - 1 < 0) {
//                         if (arr[0] > a) {
//                             System.out.println(0);
//                             break myloop;

//                         }

//                     }else if(index+1 >arr.length){
//                         if(arr[arr.length]>a){
//                             System.out.println(arr.length+1);
//                             break myloop;
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }


import java.util.Arrays;
import java.util.Scanner;

public class Interesting_drink {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int No_shops = sc.nextInt();
        int arr[] = new int[No_shops];
        for (int i = 0; i < No_shops; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);  // Sort the array to apply binary search
        
        int output = sc.nextInt();
        for (int i = 0; i < output; i++) {
            int a = sc.nextInt();
            
            // Using binary search to find the right position
            int low = 0;
            int high = arr.length;
            
            while (low < high) {
                int mid = (low + high) / 2;
                if (arr[mid] <= a) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            
            System.out.println(low);  // This gives the count of elements <= a
        }
        
        sc.close();
    }
}
