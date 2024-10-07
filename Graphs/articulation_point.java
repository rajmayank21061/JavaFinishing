import java.util.*;
public class articulation_point {
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
        public static void dfs(ArrayList<Edge>[] graph,int curr,int prnt,int dt[],int low[],boolean vis[] ,int time,boolean[] ap){
            vis[curr] = true;
            dt[curr] = low[curr] = ++time;
            int child = 0;
            for(int i =0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                int neigh = e.dst;
                
                if(prnt == neigh){
                    continue;
                } else if (vis[neigh]) {
                    low[curr] = Math.min(low[curr], dt[neigh]);

                }
                else{
                    dfs(graph, neigh, curr, dt, low, vis, time, ap);
                    low[curr] = Math.min(low[curr], low[neigh]);
                if(dt[curr] <= low[neigh] && prnt != -1){
                    ap[curr] = true;
                }
                child++;
                }
            }
            if(prnt == -1 && child > 1){
                ap[curr] = true;
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
                    dfs(graph, i, -1, dt, low, vis, time, ap);
                }
            }
            for(int i = 0; i<v ;i++){
                if(ap[i]){
                    System.out.print("Articulation Point " + i);
                }
                System.out.println();
            }
        }
        
        public static void main(String[] args) {
            int v = 6;
            ArrayList<Edge>[] graph = new ArrayList[v];
            createGraph(graph);

            get_ap(graph, v);
            

        }
    }
