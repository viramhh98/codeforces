import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int length=sc.nextInt();
        int sum=0;
        for(int i=0; i<length; i++){
            sum+=sc.nextInt();
        }
        if(sum>0){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }   
}
