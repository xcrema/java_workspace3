package prims_algorithm;

public class Solution {
	static final int V = 5;
	
	public static void main(String[] args) {
		Solution t = new Solution();
		
		int graph[][] = new int[][] {
			{0, 2, 0, 6, 0},
			{2, 0, 3, 8, 5},
			{ 0, 3, 0, 0, 7 }, 
            { 6, 8, 0, 0, 9 }, 
            { 0, 5, 7, 9, 0 }
		};
		t.primMST(graph);
		
	}

	private void primMST(int[][] graph) {
		// TODO Auto-generated method stub
		int parent[] = new int[V];
		
		int key[] = new int[V];
		
		boolean mstSet[] = new boolean[V];
		
		for(int i=0; i<V; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}
		
		key[0] = 0;
		
		parent[0] = -1;
		
		
	}
}
