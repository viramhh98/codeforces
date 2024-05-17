import java.util.Scanner;

public class cAPS_lOCK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String question=sc.next();
        String other=(String) (question.subSequence(1,question.length()));
        if(other.compareTo(other.toUpperCase())==0){
            String first=(String)(question.charAt(0)+"").toUpperCase();
            if(first.compareTo((String)(question.charAt(0)+""))==0){
                first=first.toLowerCase();
            }
            System.out.println(first+other.toLowerCase());
        }else{
            System.out.println(question);
        }
    }
}
