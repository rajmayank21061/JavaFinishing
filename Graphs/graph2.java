import java.util.ArrayList;

public class graph2 {
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
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCyclicGraph(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dst]) {
                return true;
            } else if (!vis[e.dst]) {
                if (isCyclicGraph(graph, vis, e.dst, rec)) {
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int vrtx = 4;
        ArrayList<Edge>[] graph = new ArrayList[vrtx];
        createGraph(graph);
        boolean visited[] = new boolean[vrtx];
        //recursion stack array
        boolean rec[] = new boolean[vrtx];
    //for reach ,each directed graph(vertex)
        for(int i =0 ; i<vrtx; i++){
        if(!visited[i]){
        boolean isCycle = isCyclicGraph(graph, visited, 0,rec);
        if(isCycle){
        System.out.println(isCycle);
        break; 
        }
           }
        }
    }
}