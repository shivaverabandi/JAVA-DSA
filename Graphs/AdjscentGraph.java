package Graphs;
import java.util.*;

class Edge{               
    int src;
   // int wt; weight = 1 thats why I commnented it.
    int dest;

    Edge(int src, /*int wt*/ int dest){
        this.src = src;
      //  this.wt = wt;
        this.dest = dest;
    }
}

public class AdjscentGraph {
    public static void createGraph(ArrayList<Edge> []graph, int len){
        // Intial values are null in array, so create an empty list in each index
        for(int i = 0; i<len; i++){
            graph[i] = new ArrayList<>();
        }
        // Now manually add src, dest. Here i took wt as constant so i didn't take.

        // vertex 0 means src is 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // vertex 1 means src is 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        //vertex 2 means src is 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
    }
    public static void main(String[] args) {
        // here ArrayList type array is created.
        // Observe the usuall syntax of array is
        // type []var = new type[size];
        ArrayList<Edge> []graph = new ArrayList[3];
        createGraph(graph,graph.length);
    }
}