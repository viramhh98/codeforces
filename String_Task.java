import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String question=sc.next();
        String vowels="aeiouyAEIOUY";
        String answer="";
        for (int i = 0; i < question.length(); i++) {
            if(vowels.contains(question.charAt(i)+"")){

            }else{
                answer=answer+"."+(question.charAt(i)+"").toLowerCase();
            }
        }
        System.out.println(answer);
    }   
}
