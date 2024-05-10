import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stone=sc.nextInt();
        String question=sc.next();
        int answer=0;
        char compare='Q';//random variable Q taken
        for(int i=0; i<question.length(); i++){
            if(question.charAt(i)==compare){
                    answer++;
            }else{
                compare=question.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
