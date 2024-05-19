import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int events=sc.nextInt();
        int police=0;
        int chor=0;
        int input=0;
        for (int i = 0; i < events; i++) {
            input=sc.nextInt();
            if(input>0){
                police+=input;
            }else{
                if(police<-input){
                    chor+=(-input)-police;
                    police=0;
                }else{
                    police+=input;
                }   
            }
        }
        System.out.println(chor);
    }
}
