import java.util.LinkedList;
import java.util.Queue;

public class Josephus {
   static int game(int n,int k){
      Queue<Integer> queue = new LinkedList<>();
      for(int i=1;i<=n;i++){
        queue.offer(i);
      }
while(queue.size()>1){
    for(int j=0;j<k-1;j++){
         queue.offer(queue.poll());
      }
      queue.poll();
}
      return queue.poll();
   }
    public static void main(String[] args) {
        int n=7;
        int k=3;
        int ans =game(n,k);
         System.out.println(ans);
    }
}
