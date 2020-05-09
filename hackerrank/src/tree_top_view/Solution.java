package tree_top_view;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	private static Node insert(Node root, int key) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new Node(key);
		}
		else {
			if(root.data>key) {
				root.left = insert(root.left, key);
			}
			else if(root.data<key) {
				root.right = insert(root.right, key);
			}
		}
		return root;
	}
	
	private static void inorder(Node root) {
		if(root == null)
			return;
		else {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	public static void main(String[] args) {
		Node root = new Node(5);
		root = insert(root, 3);
		root = insert(root, 2);
		root = insert(root, 1);
		root = insert(root, 4);
		root = insert(root, 9);
		root = insert(root, 6);
		
		System.out.println("Inorder: ");
		inorder(root);
		System.out.println("\nTop view: ");
		printTop(root);
		
	}

	private static void printTop(Node root) {
		// TODO Auto-generated method stub
		Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
		
		printTop(root, 0, 0, map);
		
		for(Pair<Integer, Integer> it:map.values()) {
			System.out.print(it.first+" ");
		}
	}

	private static void printTop(Node root, int dist, int level, Map<Integer, Pair<Integer, Integer>> map) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		
		if(!map.containsKey(dist) || level < map.get(dist).second) {
			map.put(dist, Pair.of(root.data, level));
		}	
		printTop(root.left, dist-1, level+1, map);
			
		printTop(root.right, dist+1, level+1, map);
		
	}
}
