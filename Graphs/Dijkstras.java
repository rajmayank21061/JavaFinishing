import java.util.ArrayList;

public class DiskstraAlgo {
    public static class pair implements comparable<pair> {
        int node;
        int dist;
        public pair(int node,int distence){
            this.node = node;
            this.dist = distence;
        }
        @Override
        public int compareTo(pair p2){
            return this.dist - p2.dist;
        }
    }
    public static class Edge{
        int source;
        int destination;
        int weight;
        public Edge(int src,int dst,int wt){
            this.source = src;
            this.destination =dst;
            this.weight = wt;
        }
    }
        public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1, 3,7));
        graph[1].add(new Edge(1, 2,1));
        
        graph[2].add(new Edge(2, 4,3));

        graph[3].add(new Edge(3, 5,1));

        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 5,5));

    }
    public static void diskstra(ArrayList<Edge> graph[],int src){
        
    }
    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

    }
}
