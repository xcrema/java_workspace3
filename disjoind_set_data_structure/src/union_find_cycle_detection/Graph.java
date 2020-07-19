package union_find_cycle_detection;
import java.util.*;

public class Graph {
	
	int V, E;
	Edge edge[];
	
	class Edge{
		int src, dest;
	}
	
	public Graph(int v, int e) {
		// TODO Auto-generated constructor stub
		V = v;
		E = e;
		edge = new Edge[E];
		
		for(int i=0; i<E; i++)
			edge[i] = new Edge();
	}

	public static void main(String[] args) {
		
		int V = 3, E = 3;
		Graph graph = new Graph(V, E);
		
		graph.edge[0].src = 0;
		graph.edge[0].dest = 1; 
		  
	        // add edge 1-2 
	    graph.edge[1].src = 1; 
	    graph.edge[1].dest = 2; 
	  
	        // add edge 0-2 
	    graph.edge[2].src = 0; 
	    graph.edge[2].dest = 2; 
	    
	    if(graph.isCycle(graph) == 1)
	    	System.out.println("Cycle");
	    else
	    	System.out.println("No Cycle");
	}

	private int isCycle(Graph graph) {
		
		int parent[] = new int[graph.V];
		
		for(int i=0; i<graph.V; i++)
			parent[i]=-1;
		
		for(int i=0; i<graph.E; i++) {
			
			int x = graph.find(parent, graph.edge[i].src);
			int y = graph.find(parent, graph.edge[i].dest);
			
			if(x==y)
				return 1;
			
			graph.Union(parent, x, y);
		}
		
		return 0;
	}

	private void Union(int[] parent, int x, int y) {
		// TODO Auto-generated method stub
		int xset = find(parent, x);
		int yset = find(parent, y);
		
		parent[xset] = yset;
	}

	private int find(int[] parent, int i) {
		// TODO Auto-generated method stub
		if(parent[i] == -1)
			return i;
		
		return find(parent, parent[i]);
	}
}
