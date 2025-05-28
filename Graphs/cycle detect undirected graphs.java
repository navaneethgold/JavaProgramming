import java.util.*;
public class graphs{
    public static class edge{
        int src;
        int dest;
        public edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void creategraph(ArrayList<edge>graph[],int v){
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<edge>();
            
        }
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1,2));
        graph[1].add(new edge(1,3));
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,1));
        graph[2].add(new edge(2,3));
        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,2));
        for(int i=0;i<graph[2].size();i++){
            edge e =graph[2].get(i);
            System.out.println(e.dest);
        }
    }
    public static boolean cycledetect(ArrayList<edge>graph[],int par,int curr ,boolean vis[]){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(vis[e.dest]==true && e.dest!=par){
                return true;
            }
            if(!vis[e.dest]){
                if(cycledetect(graph,curr,e.dest,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int v=4;
        ArrayList<edge>graph[]=new ArrayList[v];
        creategraph(graph,v);
        boolean vis[]=new boolean[v];
        if(cycledetect(graph,-1,0,vis)){
            System.out.println("cycle exist");
        }
        else{
            System.out.println("cycle does not exist");
        }
    }
}