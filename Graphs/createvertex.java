import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class createvertex {
    public static class edge{
        int src;
        int dst;
        int wt;
        public edge(int s,int d,int w){
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }
    public static void printPath(ArrayList<edge> graph[],boolean[] visited,int curr,String path,int target){
        if(curr == target){
            System.out.println(path);
            return;
        }
        for(int i = 0; i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(visited[e.dst] == false){
                visited[curr] = true;
                printPath(graph, visited, e.dst, path+e.dst, target);
                visited[curr] = false;
            }
        }
    }
    public static void bfs(ArrayList<edge> graph[],boolean[] visited,int start){
        Queue<Integer> q = new ArrayDeque<>();
        
        //create an empty queue
        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if(visited[curr] == false){
                visited[curr] = true;
                System.out.println(curr);
                for(int i = 0; i < graph[curr].size(); i++){
                edge e = graph[curr].get(i);
                q.add(e.dst);
                } 
            }
        }
    }
    public static void dfs(ArrayList<edge> graph[],int curr,boolean[] visited){
            System.out.print(curr + " ");
            visited[curr] = true;
            
            for(int i = 0; i<graph[curr].size(); i++){
                edge e = graph[curr].get(i);
                if(visited[e.dst] == false){
                dfs(graph, e.dst, visited);
            }
        }
    }
    public static void createGraph(ArrayList<edge> graphs[]){
        for(int i = 0; i<graphs.length; i++){
            graphs[i] = new ArrayList<edge>();
        }
        
        graphs[0].add(new edge(0, 2,5));
        
        graphs[1].add(new edge(1, 2,6));
        graphs[1].add(new edge(1, 3,-2));

        graphs[2].add(new edge(2, 0,5));
        graphs[2].add(new edge(2, 1,-8));
        graphs[2].add(new edge(2, 3,9));

        graphs[3].add(new edge(3, 1,4));
        graphs[3].add(new edge(3, 2,7));

        graphs[4].add(new edge(4, 2, 1));
        graphs[4].add(new edge(4, 3, 1));
        graphs[4].add(new edge(4, 5, 1));

        graphs[5].add(new edge(5, 3, 1));
        graphs[5].add(new edge(5, 4, 1));
        graphs[5].add(new edge(5, 6, 1));

        graphs[6].add(new edge(6, 5, 1));
    }

    public static void main(String[] args) {

        ArrayList<edge> graph[] = new ArrayList[7];
        createGraph(graph);

        boolean[] visited = new boolean[graph.length];

       /* for(int i = 0; i<graph[2].size(); i++){
            edge e = graph[2].get(i);
            System.out.print(e.dst + " " + e.wt );
            System.out.println();
        } */
       //this changes made for when given sub graphs
       /* 
        for(int i = 0; i<graph.length; i++){
            if(visited[i] == false){
                //bfs(graph,visited,i);  
                dfs(graph, 0, visited);
            }
        }
             */
            int src = 0;
            visited[src] = true;
        printPath(graph, visited,src, "" + src, 5);
    }
}