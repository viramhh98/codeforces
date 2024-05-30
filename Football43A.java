import java.util.Scanner;

public class Football43A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String teamA=sc.next();
        String teamB="";
        int teamA_count=1;
        int teamB_count=0;
        for (int i = 1; i < n; i++) {
            String c=sc.next();
            if(c.compareTo(teamA)==0){
                teamA_count++;
            }else{
                teamB=c;
                teamB_count++;
            }
        }
        System.out.println((teamA_count>teamB_count)?teamA:teamB);
    }
}
