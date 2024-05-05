import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for(int i=0; i<test_case; i++){
            String test_value=sc.next();
            if(test_value.length()<=10){
                System.out.println(test_value);
            }else{
                String answer="";
                answer+=test_value.charAt(0);
                int length=(test_value.length()-2);
                answer+=length;
                answer+=test_value.charAt(test_value.length()-1);
                System.out.println(answer);
            }
        }
    }   
}
