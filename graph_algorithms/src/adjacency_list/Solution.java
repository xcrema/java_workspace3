package adjacency_list;
import java.util.*;

public class Solution {
	public static void addEdge(HashMap<Integer, LinkedList<Integer>> list, int u, int v) {
		if(!list.containsKey(u)) 
			list.put(u, new LinkedList<Integer>());
		if(!list.containsKey(v))
			list.put(v, new LinkedList<Integer>());
		
		list.get(u).add(v);
		list.get(v).add(u);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, LinkedList<Integer>> list = new HashMap<Integer, LinkedList<Integer>>();
		
		addEdge(list, 0, 1); 
        addEdge(list, 0, 4); 
        addEdge(list, 1, 2); 
        addEdge(list, 1, 3); 
        addEdge(list, 1, 4); 
        addEdge(list, 2, 3); 
        addEdge(list, 3, 4); 
        
        for(Map.Entry<Integer, LinkedList<Integer>> entry : list.entrySet()){
        	System.out.print(entry.getKey());
        	for(Integer value:entry.getValue())
        		System.out.print("->"+value);
        	System.out.print("\n");
        }
		sc.close();
	}
}
