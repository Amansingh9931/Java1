import java.util.*;

public class BFS{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

         // 0-vertex
        graph[0].add(new Edge(0, 1, 1));  
        graph[0].add(new Edge(0, 2, 1));  
        

        //1-vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        //2-vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //3-vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        
        //4-vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        //5-vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(5, 5, 1));
    }

    // public static void breadthFS(ArrayList<Edge>[] graph) {
    //     Queue<Integer> q=new LinkedList<>();
    //     boolean visit[]=new boolean[graph.length];

    //     q.add(0); //source =0

    //     while(!q.isEmpty()){
    //         int curr=q.remove();

    //         if(!visit[curr]){   //visit curr
    //             System.out.print(curr+" ");
    //             visit[curr]=true;
    //             for(int i=0;i<graph[curr].size();i++){
    //                 Edge e=graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    // }

    public static void bfsf(ArrayList<Edge>[] graph) {
        boolean visit[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                bfsUtil(graph, visit);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph,boolean visit[]) {
        Queue<Integer> q=new LinkedList<>();

        q.add(0); //source =0

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!visit[curr]){   //visit curr
                System.out.print(curr+" ");
                visit[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        // breadthFS(graph);
        bfsf(graph);
    }
}