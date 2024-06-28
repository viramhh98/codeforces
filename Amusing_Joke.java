import java.util.Scanner;

public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String q = sc.next().toLowerCase();
        String w = sc.next().toLowerCase();
        if (s.length() + q.length() >= w.length()) {
            int arr[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < q.length(); i++) {
                arr[q.charAt(i) - 'a']++;
            }
            for (int i = 0; i < w.length(); i++) {
                arr[w.charAt(i) - 'a']--;
            }
            boolean a=false;
            for (int i = 0; i < 26; i++) {
                if(arr[i]==0){

                }else{
                    a=true;
                    break;
                }
            }
            if(a){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            
        } else {
            System.out.println("NO");
        }
    }
}
