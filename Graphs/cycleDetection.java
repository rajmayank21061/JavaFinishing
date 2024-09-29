import java.util.ArrayList;

public class cycleDetection {
    public static class Edge {
        int src;
        int dst;
        public Edge(int source, int destination) {
            this.src = source;
            this.dst = destination;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));
        
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }
    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vist[],int curr, int prnt){
        vist[curr] = true;
        for(int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vist[e.dst] && prnt != e.dst){
                return true;
            }
            else if(!vist[e.dst]){
                if(isCycleUndirected(graph, vist, e.dst, prnt)){
                    return true;
                }
            } 
        }
        return false;
    }

    public static void main(String[] args) {
        int vrtx = 6;
        
        ArrayList<Edge> graph[]  = new ArrayList[vrtx];
        createGraph(graph);
        
        System.out.println(isCycleUndirected(graph, new boolean[vrtx], 0, -1));
    }
}
