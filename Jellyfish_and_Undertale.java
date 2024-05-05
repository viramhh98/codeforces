import java.util.Scanner;

public class Jellyfish_and_Undertale {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            int test_case = sc.nextInt();
            for (int i = 0; i < test_case; i++) {
                long max_time=sc.nextLong();
                long start_time=sc.nextLong();
                long tools=sc.nextLong();
                long totaltime=0;
                for(int j=0; j<tools; j++){
                    long store=sc.nextLong();
                   if(max_time>store){
                        totaltime+=store;
                    }else{
                        totaltime+=Math.min(max_time, store)-1;
                    }
                }
                totaltime+=start_time;
                System.out.println(totaltime);
        }
    }
}