import java.util.ArrayList;
public class graph2 {
    public static class edge{
        int sc;
        int dst;
        public edge(int source,int destination){
            this.sc = source;
            this.dst = destination;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(1, 0));
        graph[0].add(new edge(2, 3));
        graph[0].add(new edge(3, 0));
    }
    public static void main( String args[]){
        int vrtx = 4;
        ArrayList<edge> graph[] = new ArrayList[vrtx];
        createGraph(graph);
    }
}
