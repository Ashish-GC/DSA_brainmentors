import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class graphdemo{

   static void addEdges(ArrayList<ArrayList<Integer>> adj,int u,int v){  
            //   undirected

            adj.get(u).add(v);
            adj.get(v).add(u);
    }
   static void printgraph(ArrayList<ArrayList<Integer>> adj){
             for(int i=1;i<adj.size();i++){
                System.out.print(i+" : ");
                for(int j=1;j<adj.get(i).size();j++){
                    System.out.print(adj.get(i).get(j)+" ");
                }
                System.out.println();
             }
    }
       
    // bfs using queue
    static void printdfs(ArrayList<ArrayList<Integer>> adj,int v,int source){
                 Queue<Integer> queue = new LinkedList<>();
                 queue.offer(source);
                 int visited[]=new int[v+1];
                   visited[source]=1;

                 while(!queue.isEmpty()){
                    source=queue.poll();
                     System.out.print(source+",");
                     int size=adj.get(source).size();

                    for(int i=0;i<size;i++){
                        int adjnode=adj.get(source).get(i);
                      if(visited[adjnode]==0){
                        visited[adjnode]=1;
                             queue.offer(adjnode); 
                      }
                       
                    }
                 }

    }
        //   dfs
        static void caldfs(ArrayList<ArrayList<Integer>> adj,int source,int visited[]){
                   visited[source]=1;
            System.out.print(source+" ");
                 for(int m : adj.get(source)){
                if(visited[m]==0){
                     caldfs(adj,m,visited);
                }  
                 }
        }
        static void dfs(ArrayList<ArrayList<Integer>> adj,int v){
                int visited[]=new int[v+1];
                caldfs(adj,1,visited);
        }

        // shortest path in unweighted graph
      static int[] shortestpath(ArrayList<ArrayList<Integer>> adj,int v,int source,int[] dist,int[] visited){
                Queue<Integer> queue = new LinkedList<>();
                  queue.offer(source);
                   visited[source]=1;

                  while(!queue.isEmpty()){
                         source=queue.poll();
                    for(int u : adj.get(source)){
                         if(visited[u]==0){
                        dist[u]=1+dist[source];
                        visited[u]=1;
                         queue.offer(u);
                         }
                        
                    }
                  }
                  return dist;
        }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
           int v=6;
        for(int i=1;i<=v+1;i++){
              adj.add(new ArrayList<>());
        }
          addEdges( adj ,1,2);
          addEdges( adj ,1,3);
          addEdges( adj ,2,4);
          addEdges( adj ,2,5);
          addEdges( adj ,3,5);
          addEdges( adj ,4,5);
          addEdges( adj ,4,6);
          addEdges( adj ,5,6);

          printgraph(adj);
        System.out.println();
        printdfs(adj,v,1);
      System.out.println();
        dfs(adj,v);
         System.out.println();
         int dist[]=new int[v+1];
          int visited[]=new int[v+1];
        int result[]= shortestpath(adj,v,1,dist,visited);

              for(int i=1;i<result.length;i++){
                System.out.print(result[i]+" ");
              }
    }
}