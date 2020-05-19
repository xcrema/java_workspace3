package krushkal_algorithm;

import java.util.Arrays;

public class Solution {
	class Edge implements Comparable<Edge>{
		int src, dest, weight;
		public int compareTo(Edge compareEdge) {
			return this.weight-compareEdge.weight;
		}
	}
	int V, E;
	Edge edge[];
	
	 public Solution(int v, int e) {
		// TODO Auto-generated constructor stub
		 V = v;
		 E = e;
		 edge = new Edge[E];
		 for(int i=0; i<e; i++)
			 edge[i] = new Edge();
	}

	public static void main(String[] args) {
		 int V = 4;
		 int E = 5;
		 Solution graph = new Solution(V, E);
		 
		// add edge 0-1 
	        graph.edge[0].src = 0; 
	        graph.edge[0].dest = 1; 
	        graph.edge[0].weight = 10; 
	  
	        // add edge 0-2 
	        graph.edge[1].src = 0; 
	        graph.edge[1].dest = 2; 
	        graph.edge[1].weight = 6; 
	  
	        // add edge 0-3 
	        graph.edge[2].src = 0; 
	        graph.edge[2].dest = 3; 
	        graph.edge[2].weight = 5; 
	  
	        // add edge 1-3 
	        graph.edge[3].src = 1; 
	        graph.edge[3].dest = 3; 
	        graph.edge[3].weight = 15; 
	  
	        // add edge 2-3 
	        graph.edge[4].src = 2; 
	        graph.edge[4].dest = 3; 
	        graph.edge[4].weight = 4; 
	        
	        graph.KrushkalMST();
	        
	}

	class subset{
		int parent, rank;
	};
	
	private void KrushkalMST() {
		// TODO Auto-generated method stub
		Edge result[] = new Edge[V];
		int e = 0;
		int i = 0;
		for(i=0; i<V; i++)
			result[i] = new Edge();
		
		Arrays.sort(edge);
		
	}
}
