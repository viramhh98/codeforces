import java.util.Scanner;

public class Different_String {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int k = 0; k < test_case; k++) {
            String question=sc.next();
            int answer=0;
            int change1,change2;
            char compare=question.charAt(0);//random variable Q taken
            myloop:for(int i=1; i<question.length(); i++){
                if(question.charAt(i)==compare){
                        // answer++;
                }else{
                    compare=question.charAt(i);
                    for(int z=0; z<i ;z++){
                        if(question.charAt(z)!=compare){
                            change1=z;
                            change2=i;
                            System.out.println("yes");
                            // System.out.println(question.substring(0, z));
                            // System.out.println(compare);
                            // System.out.println(question.substring(z, i));
                            // System.out.println(question.charAt(z));
                            // System.out.println(question.substring(i, question.length()));
                            String answer2=question.substring(0, z)+compare+question.substring(z+1, i)+question.charAt(z)+question.substring(i+1, question.length());
                            System.out.println(answer2);
                            answer++;
                            break myloop;
                        }
                    }
                }
            }
            if(answer!=0 && question.length()!=1){

            }else{
                System.out.println("no");
            }
        }
    }
}
