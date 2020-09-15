package constructbstfrompostorder;
import java.util.*;



class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Solution {
	static Node insertData(Node root, int data){
		if(root==null)
			return new Node(data);
		else if(root.data<data) {
			root.right = insertData(root.right, data);
		}
		else if(root.data>data)
			root.left = insertData(root.left, data);
		return root;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-->0) {
			int n = Integer.parseInt(sc.next());
			int []post = new int[n];
			Node root = null;
			
			for(int i=0; i<n; i++) 
				 post[i] = Integer.parseInt(sc.next());
				 
			root = makeBST(post, 0, n-1);
			inroder(root);
			
		}
	}
	private static void inroder(Node root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			inroder(root.left);
			System.out.println(root.data);
			inroder(root.right);
		}
	}
	private static Node makeBST(int[] post, int i, int j) {
		// TODO Auto-generated method stub
		if(i>j || i<0)
			return null;
		else {
			Node root = new Node(post[j]);
			int x = -1;
			
			for(int k=(j-1); k>=i; k--) {
				if(post[k]<post[j]) {
					x = k;
					break;
				}
			}
			
			root.left = makeBST(post, 0, x);
			root.right = makeBST(post, x+1, j-1);
			
			return root;
		}
		
		
	}
	
}
