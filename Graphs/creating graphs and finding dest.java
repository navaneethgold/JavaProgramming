import java.util.*;
public class graphs{
    static class edge{
        int src;
        int dest;
        public edge(int src , int dest){//u can just add a another parameter for weight also 
            this.src=src;
            this.dest=dest;
            
        }
    }
    public static void creategraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
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
    public static void main(String args[]){
        int v=4;
        ArrayList<edge>graph[]=new ArrayList[v];
        creategraph(graph);//this creategraoh is a static function so there is no need of creating a object for the class graphs directly u can call a static function
    }
}