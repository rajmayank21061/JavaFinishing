import java.util.*;

public class Dijkstras {

    static class Pair implements Comparable<Pair>{
        int node;
        int path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // Ascending order based on path cost
        }
    }

    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int src, int dst, int wt) {
            this.source = src;
            this.destination = dst;
            this.weight = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE); // Set all distances to infinity
        dist[src] = 0; // Distance to source is 0

        boolean[] visited = new boolean[V];
        pq.add(new Pair(src, 0)); // Start from the source node

        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); // Get the node with the shortest path

            if (!visited[curr.node]) {
                visited[curr.node] = true;

                for (Edge edge : graph[curr.node]) {
                    int u = edge.source;
                    int v = edge.destination;

                    // Relaxation step
                    if (dist[u] + edge.weight < dist[v]) {
                        dist[v] = dist[u] + edge.weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // Print shortest distances
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices (changed to 6 to match the graph)
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0, V);
    }
}
