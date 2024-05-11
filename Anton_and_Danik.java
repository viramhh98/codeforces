import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        String question=sc.next();
        int Anton=0;
        for (int i = 0; i <length; i++) {
            if(question.charAt(i)=='A'){
                Anton++;
            }
        }
        int Danik=question.length()-Anton;
        if(Anton==Danik){
            System.out.println("Friendship");
        }else if(Anton>Danik){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
    }
}
