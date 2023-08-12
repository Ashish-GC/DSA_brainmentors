import java.util.LinkedList;
import java.util.Queue;

public class BinaryNums {

    static void printBinary(int n){
         Queue<String> queue =new LinkedList<>();
         queue.offer("1");
         for(int i=0;i<n;i++){
            String current=queue.poll();
            System.out.println(current);

            String e1=current+"0";
            String e2=current+"1";

              queue.offer(e1);
              queue.offer(e2);
            
         }
    }
    public static void main(String[] args) {
        int n=10;
        printBinary(n);
    }
}