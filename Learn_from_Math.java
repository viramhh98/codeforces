import java.util.Scanner;

public class Learn_from_Math {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(4 + " "+ (a-4));
        }else{
            int num=8;
           mylloop : while(true){
                boolean flag=false;
                num++;
                for (int i = 3; i*i <a; i++) {
                    if((num)%i==0){
                        flag=true;
                        break mylloop;
                    }
                }
           }
           System.out.println(num+ " "+ (a-num));

        }
    }   
}
