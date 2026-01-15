
import java.util.*;

public class isCyclic_undirected{
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

         // 0-vertex
        graph[0].add(new Edge(0, 1));  
        // graph[0].add(new Edge(0, 2));  
        graph[0].add(new Edge(0, 3)); 
        

        //1-vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        //2-vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        //3-vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // 4-vertex
        graph[4].add(new Edge(4, 3));
    }

    public static boolean  detectCycle(ArrayList<Edge>[] graph) {
        boolean visit[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if (!visit[i]) {
                if(detectCycleUtil(graph, visit, i, -1)){
                    return true;
                    //cycle exits in one part
                }
            }
        }
        return false;
    }
    
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visit,int curr,int parent) {
       //visit
       visit[curr]=true;

       //neighbour
       for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        // case 3: if the neighbour is visited and is not the parent
        if(!visit[e.dest]){
            if(detectCycleUtil(graph, visit, e.dest, curr)) return true;
        }

        //case 1: if the neighbour is not visited
        else if(visit[e.dest] && e.dest != parent) return true;

        //case 2: if the neighbour is visited and is the parent ,do nothing

       }
       return false;
    }

    public static void main(String[] args) {
        
        
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        // DepthFS(graph,0,new boolean[V]);
        System.out.println(detectCycle(graph));
    }
}