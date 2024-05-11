import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question=sc.next();
        int lower=0;
        for(int i=0; i<question.length(); i++){
            if(question.charAt(i)>='a' && question.charAt(i)<='z'){
                lower++;
            }
        }
        int upper=question.length()-lower;
        if(upper-lower<=0){
            System.out.println(question.toLowerCase());
        }else{
            System.out.println(question.toUpperCase());
        }
    }
}
