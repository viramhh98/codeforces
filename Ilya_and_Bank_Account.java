import java.util.*;
 
public class  Ilya_and_Bank_Account {
    public static void main(String[] args){
        long acc = new Scanner(System.in).nextLong();
        if(acc < 0)
            acc = Math.max(acc/100*10 + acc%10, acc/10);
        System.out.print(acc);
    }
}