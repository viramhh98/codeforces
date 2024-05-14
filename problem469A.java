import java.util.Scanner;

public class problem469A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int levels=sc.nextInt();
        int arr[]=new int[levels+1];
        int person1=sc.nextInt();
        for(int i=0; i<person1; i++){
            arr[sc.nextInt()]+=1;
        }
        int person2=sc.nextInt();
        for(int i=0; i<person2; i++){
            arr[sc.nextInt()]+=1;
        }
        boolean flag=false;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Oh, my keyboard!");
        }else{
            System.out.println("I become the guy.");
        }

    }
}