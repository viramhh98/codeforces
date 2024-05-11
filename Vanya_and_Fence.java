import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int height=sc.nextInt();
        int answer=0;
        for(int i=0; i<number; i++){
            int a=sc.nextInt();
            if(a>height){
                answer+=2;
            }else{
                answer+=1;
            }
        }
        System.out.println(answer);
    }
}
