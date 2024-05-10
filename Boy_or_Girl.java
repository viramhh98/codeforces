import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        name=name.toUpperCase();
        int arr[]=new int[26];
        for(int i=0; i<name.length(); i++){
            arr[name.charAt(i)-'A']+=1;
        }
        int answer=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                answer++;
            }
        }
        if(answer%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
