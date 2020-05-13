package breadth_first_search;
import java.util.*;

public class Solution {
	int V;
	LinkedList<Integer> list[];
	
	@SuppressWarnings("unchecked")
	Solution(int V){
		this.V = V;
		list = new LinkedList[V];
		for(int i=0; i<V; i++)
			list[i] = new LinkedList<Integer>();
		
	}
	public static void main(String[] args) {
		Solution g = new Solution(4);
		
			g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	        
	        g.BSF(2);
		
	}
	private void BSF(int i) {
		// TODO Auto-generated method stub
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.add(i);
		visited[i] = true;
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			System.out.println(node);
			
			Iterator<Integer> it = list[node].iterator();
			while(it.hasNext()) {
				Integer temp = it.next();
				if(!visited[temp]) {
				queue.add(temp);
				visited[temp] = true;
				}
			}
		}
	}
	private void addEdge(int i, int j) {
		// TODO Auto-generated method stub
		list[i].add(j);
	}
}
