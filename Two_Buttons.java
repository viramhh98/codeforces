import java.util.*;
public class Two_Buttons
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ans=0;
		while(m>n){
		    if(m%2==1){
		        m++;
		        ans++;
		    }
		    m=m/2;
		    ans++;
		}
		ans+=(n-m);
		System.out.println(ans);
	}
}