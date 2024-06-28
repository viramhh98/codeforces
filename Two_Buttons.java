import java.util.Scanner;

public class Two_Buttons {
    static int n=0;
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Two_Buttons s=new Two_Buttons();
        n = sc.nextInt();
        int m = sc.nextInt();
        count = 0;

        if (n == m) {

        } else if (n > m) {
            count += n - m;
        } else {
           if(m%2==0){
                count=evenans(m);
           }else{
                count=oddans(m);
           }
        }
        System.out.println(count);
    }
    // static int evenans(int m){
    //     int count=0;
    //     int a =m/2;
    //     while (n < a) {
    //         n *= 2;
    //         count++;
    //     }
    //     if (n > a) {
    //         count += n - a;
    //         n-=(n-a);
    //     }
    //     n*=2;
    //     return ++count;
    // }
    static int evenans(int m){
        System.out.println("even "+ n + " "+ m + " "+count);
        if(n==m){
            return 0;
        }
        if(n<Math.ceilDiv(m, 2)){
            if(m%2==0){
                count +=evenans(m/2);
            }else{
                count+=oddans(m/2);
            }
        }
        n*=2;
        return count+1;
    }
    static int oddans(int m){
        System.out.println("odd "+ n + " "+ m + " "+count);

        if(n==m){
            return 0;
        }if(n<Math.ceilDiv(m, 2)){
            if(m%2==0){
               count+= evenans(m/2);
            }else{
                count+= oddans(m/2);
            }
        }
        n*=2;
        n=(n-m);
        return count+ 1+n;
    }
}
