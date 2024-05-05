import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            char letters[]=new char[26];
            int length=sc.nextInt();
            int remove=sc.nextInt();
            String word=sc.next();
            for(int j=0; j<length; j++){
                letters[word.charAt(j)-'a']+=1;
            }
            int count=0;
            for(int k=0; k<26; k++){
                if(letters[k]%2==1){
                    if(remove!=0){
                        letters[k]-=1;
                        remove--;
                    }else{
                        count+=1;
                    }
                }
            }
            if(count>1){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
            
        }
    }
}
