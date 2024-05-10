import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int participants = sc.nextInt();
        int rank=sc.nextInt();
        int array_rank[]=new int[participants+1];
        for(int i=1; i<array_rank.length; i++){
            array_rank[i]=sc.nextInt();
        }
        if(array_rank[rank]>0){
            for(int i=rank+1;i<array_rank.length; i++){
                if(array_rank[rank]==array_rank[i]){
                    rank++;
                }
            }
            System.out.println(rank);
        }else{
            int answer=0;
            for(int i=1; i<array_rank.length; i++){
                if(array_rank[i]!=0){
                    answer++;
                }else{
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
