import java.util.Scanner;

public class Queue_at_the_School {
   	public static void main(String[]A){
		Scanner s=new Scanner(System.in);
		s.next();
		int t=s.nextInt();
		String a=s.next();
		for(;t-->0;)
    		a=a.replaceAll("BG","GB");
		System.out.print(a);
	}
}