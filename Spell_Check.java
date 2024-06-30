import java.util.Scanner;

public class Spell_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Timur";
        int b=sc.nextInt();
        for (int k = 0; k < b; k++) {
            
            int a=sc.nextInt();
            String q=sc.next();
        boolean flag=true;
        if(a==s.length()){
            for (int i = 0; i < s.length(); i++) {
                int count=0;
                for (int j = 0; j < s.length(); j++) {
                    if(q.charAt(j)==s.charAt(i)){
                        count++;
                    }
                }
                if(count==1){
                    continue;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
    }
    }
}
