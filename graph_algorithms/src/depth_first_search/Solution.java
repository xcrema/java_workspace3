package depth_first_search;
import java.util.*;

public class Solution {
	int V;
	LinkedList<Integer> list[];
	
	@SuppressWarnings("unchecked")
	Solution(int V){
		this.V = V;
		list = new LinkedList[4];
		for(int i=0; i<V; i++)
			list[i] = new LinkedList<Integer>();
	}
	
	public static void main(String[] args) {
		Solution g = new Solution(4);
		
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 3);
        g.addEdge(2, 0); 
         
        g.addEdge(3, 3); 
        
        g.DFS(1);
	}

	private void DFS(int i) {
		// TODO Auto-generated method stub
		boolean visited[] = new boolean[V];
		visited[i] = true;
		System.out.println(i);
		Stack<Integer> stack = new  Stack<Integer>();
		
		stack.push(i);
		boolean check = false;
		
		while(!stack.isEmpty()) {
			Iterator<Integer> it = list[stack.peek()].iterator();
			while(it.hasNext()) {
				int temp = it.next();
				if(visited[temp] == false) {
					stack.push(temp);
					System.out.println(temp);
					check = true;
					visited[temp] = true;
					break;
				}
			}
			if(!check)
				stack.pop();
			check = false;
		}
	}

	private void addEdge(int i, int j) {
		// TODO Auto-generated method stub
		list[i].add(j);
	}
}
