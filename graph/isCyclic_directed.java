
import java.util.*;

public class isCyclic_directed{
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    // static void createGraph(ArrayList<Edge> graph[]){       // cycle -True
    //     for(int i=0;i<graph.length;i++){
    //         graph[i]=new ArrayList<>();
    //     }

    //     graph[0].add(new Edge(0, 2));  

    //     graph[1].add(new Edge(1, 0));

    //     graph[2].add(new Edge(2, 3));

    //     graph[3].add(new Edge(3, 0));
    // }


     static void createGraph(ArrayList<Edge> graph[]){       // cycle -True
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));  

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
    }
    
    public static boolean  isCycle(ArrayList<Edge>[] graph) {
        boolean visit[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if (!visit[i]) {
                if(isCycleUtil(graph,i, visit, stack)){
                    return true;
                    //cycle exits in one part
                }
            }
        }
        return false;
    }
    
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] visit, boolean[] stack) {
    // mark current as visited
    visit[curr] = true;
    stack[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);

        // if neighbor is already in recursion stack → cycle
        if (stack[e.dest]) {
            return true;
        }

        // if neighbor not visited → DFS deeper
        if (!visit[e.dest] && isCycleUtil(graph, e.dest, visit, stack)) {
            return true;
        }
    }

    // remove from recursion stack after exploring
    stack[curr] = false;
    return false;
}
    public static void main(String[] args) {
        
        
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];

        createGraph(graph);

        // DepthFS(graph,0,new boolean[V]);
        System.out.println(isCycle(graph));
    }
}