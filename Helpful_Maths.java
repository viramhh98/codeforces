import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String question=sc.next();
        int one=0;
        int two=0;
        int three=0;
        for(int i=0; i<question.length(); i++){
            char substring =question.charAt(i);
            if(substring=='+'){

            }else if(substring=='1'){
                one++;
            }else if(substring=='2'){
                two++;
            }else if(substring=='3'){
                three++;
            }
        }
        String answer="";
        while (one!=0 || two!=0 || three!=0) {
            if(one!=0){
                answer=answer+1+"+";
                one--;
            }else if(two!=0){
                answer=answer+2+"+";
                two--;
            }else{
                answer=answer+3+"+";
                three--;
            }
        }
        String ans="";
        for (int i = 0; i < answer.length()-1; i++) {
            ans+=answer.charAt(i);
        }
        System.out.println(ans);
    }
}
