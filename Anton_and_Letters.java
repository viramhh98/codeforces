import java.util.Scanner;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question=sc.nextLine();
        char arr[]=new char[26];
        for (int i = 1; i < question.length(); i+=3) {
            if(question.charAt(i)>='a' &&  question.charAt(i)<='z'){
                arr[question.charAt(i)-'a']=1;
            }
        }
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                ans+=1;
            }
        }
        System.out.println(ans);
    }
}
