import java.util.Scanner;

public class Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a*m<b){
            System.out.println(a*n);
        }else{
            if(n%m!=0){
                if((n%m)*a < b){
                    System.out.println((n/m)*b+ (n%m)*a);
                }else{
                    System.out.println(((n/m)+1)*b);
                }
            }else{
                System.out.println((n/m)*b);
            }
        }
    }
}


// import java.util.Scanner;
 
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int m = scanner.nextInt();
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
        
//         int cost = 0;
 
//         if (m * a <= b) {
//             // It's cheaper to buy only one-ride tickets.
//             cost = n * a;
//         } else {
//             // It's cheaper to buy m-ride tickets.
//             cost = (n / m) * b + Math.min((n % m) * a, b);
//         }
        
//         System.out.println(cost);
//     }
// }