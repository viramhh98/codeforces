import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long value=sc.nextLong();
        long index=sc.nextLong();
        if(value%2==0){
            if(value/2>=index){
                System.out.println(2*(index)-1);
            }else{
                System.out.println(2*(index-(value/2)));
            }
            
        }else{
            // 1 3 5 7 2 4 6 
            if((value/2)+2>index){
                System.out.println(2*(index)-1);
            }else{
                System.out.println(2*((index-1)-(value/2)));
            }
          

            
        }
    }

}