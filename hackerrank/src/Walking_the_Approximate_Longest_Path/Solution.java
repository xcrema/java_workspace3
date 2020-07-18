package Walking_the_Approximate_Longest_Path;
import java.util.*;

public class Solution {
	static int V;
	static int E;
	static ArrayList<Integer> path = new ArrayList<Integer>();
	static void formAdjMat(ArrayList<ArrayList<Integer>> adj_mat, int a, int b) {
		adj_mat.get(a).add(b);
		adj_mat.get(b).add(a);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		V = sc.nextInt();
		E = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj_mat = new ArrayList<ArrayList<Integer>>(V+1);
		
		for(int i=0; i<=V; i++)
			adj_mat.add(new ArrayList<Integer>());
		
		
		
		for(int i=0; i<E; i++) {
			formAdjMat(adj_mat, Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}
		int n=0;
		
		boolean []visited=new boolean[V+1];
		
		int min = minNode(adj_mat);
		
		connectGraph(adj_mat, min, visited);
		
		System.out.println(path);
		sc.close();
	}
	
	static int minNode(ArrayList<ArrayList<Integer>> adj_mat) {
		int min = Integer.MAX_VALUE;
		int temp = -1;
		
		for(int i=1; i<adj_mat.size(); i++) {
			if(min>adj_mat.get(i).size()) {
				min=adj_mat.get(i).size();
				temp=i;
			}
		}
		
		return temp;
		
	}
	static int minNodeInNode(ArrayList<Integer> list, ArrayList<ArrayList<Integer>> adj_mat,  boolean []visited) {
		
		
		int min = Integer.MAX_VALUE;
		int temp = -1;
		
		for(int i=0; i<list.size(); i++) {
			if(min>adj_mat.get(list.get(i)).size() && visited[list.get(i)] != true) {
				min = adj_mat.get(list.get(i)).size();
				temp = list.get(i);
			}
		}
		
		return temp;
	}
	static boolean allVisited(boolean[] visited) {
		boolean flag = true;
		for(int i=1; i<visited.length; i++) {
			if(visited[i] == false) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	private static void connectGraph(ArrayList<ArrayList<Integer>> adj_mat, int min, boolean []visited) {
		// TODO Auto-generated method stub
		
		//if(adj_mat.isEmpty())
		//	return;
		if(allVisited(visited) || min==-1)
			return;
		ArrayList<Integer> list = adj_mat.get(min);
		
		path.add(min);
		//adj_mat.remove(min);
		visited[min]=true;
		
		
		if(allVisited(visited) || min==-1)
			return;
		
		min = minNodeInNode(list, adj_mat, visited);
		
		connectGraph(adj_mat, min, visited);
	}
}
