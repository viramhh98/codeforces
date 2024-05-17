import java.util.Scanner;

public class IQ_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int even=0;
        int odd=0; 
        int odd_count=0;
        for(int i=0; i<length; i++){
            if(sc.nextInt()%2==0){
                even=i;
            }else{
                odd=i;
                odd_count++;
            }
        }
        if(odd_count==1){
            System.out.println(odd+1);
        }else{
            System.out.println(even+1);
        }
    }   
}
