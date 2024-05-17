import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String question=sc.next();
        String ans="";
        int prev=-1;
        for (int i = 0; i < question.length(); ) {
            if(question.substring(i, Math.min(i+3,question.length())).compareTo("WUB")==0){
                i+=3;
            }else{
                if(prev!=i-1 && prev!=-1){
                    ans=ans+ " ";
                }
                prev=i;
                ans=ans+question.charAt(i);
                i+=1;
            }
        }        System.out.println(ans);
    }
}
