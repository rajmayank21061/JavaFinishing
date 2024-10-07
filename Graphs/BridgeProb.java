import java.util.*;
public class BridgeProb {
    public static class Edge{
        int sr;
        int dst;
        Edge(int source,int destination){
            this.sr = source;
            this.dst = destination;
        }
    }
        public static void createGraph(ArrayList<Edge>[] graph) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0,1));
            graph[0].add(new Edge(0,2));
            graph[0].add(new Edge(0,3));
    
            graph[1].add(new Edge(1, 0));
            graph[1].add(new Edge(1, 2));
            
            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 1));
    
            graph[3].add(new Edge(3,0));
            graph[3].add(new Edge(3,4));
            graph[3].add(new Edge(3,5));

            graph[4].add(new Edge(4,3));
            graph[4].add(new Edge(4,5));

            graph[5].add(new Edge(5,3));
            graph[5].add(new Edge(5,4));
    
        }
        
        public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vis,int[] dt,int[] low,int time, int prnt){
        vis[curr] = true;
        dt[curr] = low[curr] = time++;
        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if( e.dst == prnt){
                continue;
            }
            else if(!vis[e.dst]){
                dfs(graph, e.dst, vis, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.dst]);
            if(dt[curr] < low[e.dst]){
                System.out.println("bridge is "+ curr + " --- "+ e.dst);
            }
            }
            else{
                low[curr] = Math.min(low[curr],low[e.dst]);
            }

        }
        }
        public static void get_bridge(ArrayList<Edge>[] graph,int v){
            int[] dt = new int[v];
            int[] low = new int[v];
            int time = 0;
            boolean[] vis = new boolean[v];

            for(int i = 0; i<v; i++){
                if(!vis[i]){
                    dfs(graph,i,vis,dt,low,time,-1);
                }
            }
        }
        public static void get_ap(ArrayList<Edge>[] graph,int v){
            int dt[] = new int[v];
            int low[] = new int[v];
            boolean vis[] = new boolean[v];
            int time = 0; 

            boolean ap[] = new boolean[v];

            for( int i = 0; i < v; i++){
                if(!vis[i]){
                    dfs();
                }
            }
            for(int i = 0; i<v ;i++){
                if(ap[i]){
                    System.out.print("Articulation Point " + i);
                }
            }
            System.out.println();
        }
        
        public static void main(String[] args) {
            int v = 6;
            ArrayList<Edge>[] graph = new ArrayList[v];
            createGraph(graph);
            get_bridge(graph, v);

        }
    }
