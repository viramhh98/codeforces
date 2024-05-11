import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String question=sc.next();
        int answer=1;
        char compare=question.charAt(0);
        boolean flag=false;
        for(int i=1; i<question.length(); i++){
            if(question.charAt(i)==compare){
                    answer++;
            }else{
                if(answer>=7){
                    // System.out.println("YES");
                    flag=true;
                    break;
                }else{
                    answer=1;
                }
                compare=question.charAt(i);
            }
        }
        if(flag==false && answer<7){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
