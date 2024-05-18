import java.util.Scanner;
public class Registration_system{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size = 26;
        int test_case=sc.nextInt();
        openHashing call = new openHashing(size);
        for(int i=0; i<test_case; i++){
            String value = sc.next();
            int a=call.search(value);
            if(a==-1){
                call.addFirst(value);
                System.out.println("OK");
            }else{
                System.out.println(value+""+a);
            }
        }
    }
}
class openHashing {
    static Node ansArray[];
    int size;

    openHashing(int size) {
        this.size = size;
        ansArray = new Node[size];
    }

    // void print() {
    //     for (int i = 0; i < size; i++) {
    //         System.out.print(i + "   ");
    //         if (ansArray[i] == null) {
    //             System.out.println("|\\|");
    //         } else {
    //             Node traverse = ansArray[i];
    //             while (traverse != null) {
    //                 System.out.print(traverse.key + "-->");
    //                 traverse = traverse.next;
    //             }
    //             System.out.println("|\\|");
    //         }
    //     }
    // }

    int search(String key1) {
        int space = (key1.charAt(0)-'a') % size;
        Node travese = ansArray[space];
        int i = 0;
        int value=0;
        while (travese != null) {
            if (travese.key.compareTo(key1)==0) {
                // System.out.println("found after at index " + space + " after " + i + " iterations");
                travese.v+=1;
                value=travese.v;
                break;
            }
            i++;
            travese = travese.next;
        }
        if (travese == null) {
            // System.out.println("no such value found");
            return -1;
        }
        return value;
    }

    class Node {
        String key;
        Node next;
        int v;
        Node(String key) {
            this.key = key;
            next = null;
            this.v=0;
        }
    }

    void addFirst(String key) {
        int space = (key.charAt(0)-'a') % size;
        Node n = new Node(key);
        if (ansArray[space] == null) {
            ansArray[space] = n;
        } else {
            n.next = ansArray[space];
            ansArray[space] = n;
        }
    }

}