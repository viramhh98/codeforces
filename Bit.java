import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_operation=sc.nextInt();
        int answer=0;
        for(int i=0; i<no_of_operation; i++){
            String operation=sc.next();
            if(operation.charAt(0)=='+'||operation.charAt(2)=='+'){
                answer+=1;
            }else{
                answer-=1;
            }
        }
        System.out.println(answer);
    }
}
