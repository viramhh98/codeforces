import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int teams=sc.nextInt();
        int hostU[]=new int[teams];
        int guestU[]=new int[teams];
        for(int i=0;i<teams ; i++){
            hostU[i]=sc.nextInt();
            guestU[i]=sc.nextInt();
        }
        int ans=0;
        for (int i = 0; i < hostU.length; i++) {
            for (int j = 0; j < guestU.length; j++) {
                if(hostU[i]==guestU[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
