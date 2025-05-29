import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_dfs_graphs {
    public static void bfs(int v,ArrayList<ArrayList<Integer>> adj,int n){
        boolean[] visited=new boolean[v];
        Queue<Integer>q=new LinkedList<>();
        visited[n]=true;
        q.add(n);
        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr+", ");
            for(int neighbour:adj.get(curr)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
    }
    public static void dfs(int node,boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        System.out.print(node+", ");
        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,visited,adj);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;  // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Undirected graph
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(0).add(2); adj.get(2).add(0);
        adj.get(1).add(3); adj.get(3).add(1);
        adj.get(2).add(4); adj.get(4).add(2);

        System.out.println("BFS Traversal starting from node 0:");
        bfs(V, adj, 0);
        System.out.println();
        boolean[] visited = new boolean[V];

        System.out.println("DFS Traversal starting from node 0:");
        dfs(0, visited, adj);
    }
}
