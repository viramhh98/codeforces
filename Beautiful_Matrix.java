import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_matrix[][]=new int[5][5];
        int index_x=0;
        int index_y=0;
        for(int i=0; i<array_matrix.length; i++){
            for(int j=0; j<array_matrix[i].length; j++){
                array_matrix[i][j]=sc.nextInt();
                if(array_matrix[i][j]==1){
                    index_x=i+1;
                    index_y=j+1;
                }
            }
        }
       
        int answer=Math.abs((index_x-3))+Math.abs((index_y-3));
        System.out.println(answer);

    }
}
