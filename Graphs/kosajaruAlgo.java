import java.util.*;
public class kosajaruAlgo {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
        this.src = s;
        this.dest = d;
        }
        }
        static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
        graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
        
        }
    public static void topological_sort(ArrayList<Edge> graph[],boolean vis[],int curr,Stack<Integer> st){
        vis[curr] = true;
        for( int i = 0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topological_sort(graph, vis, e.dest, st);
            }
        }    
        st.push(curr);
    }
    public static void dfs(ArrayList<Edge> graph[] , boolean vis[], int curr){
        vis[curr] = true;
        System.out.print(curr + " ");
        for(int i = 0 ; i< graph[curr].size(); i++ ){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, vis, e.dest);
            }
        }
    }
    public static void kosajaru_algo(ArrayList<Edge>[] graph ,int v){
        //step1
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[v];
        for(int i = 0; i<v; i++){
            if(!vis[i]){
                topological_sort(graph, vis,i, st);
            }
        }
        //step2
        ArrayList<Edge> transpose[] = new ArrayList[v];
        for(int i = 0; i<v; i++){
            transpose[i] = new ArrayList<>();
        }
        for(int i =0; i<v; i++){
            vis[i] = false; //for empty bcs its already full;
            for(int j =0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                transpose[e.dest].add( new Edge(e.dest, e.src));
            }
        }
        //step 3
       while(!st.isEmpty()){
        int curr = st.pop();
        if(!vis[curr]){
            System.out.print("SCC : ");
        dfs(transpose, vis, curr);
        System.out.println();
       }
    }

    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        //1 Get Nodes in Stack ( topological sort)
        //2 Transpose the graph
        //3 Do dfs according to stack nodes on the transpose graph
        kosajaru_algo(graph, v);


    }
}
