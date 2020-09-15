package normal_to_balanced_bst;
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
	
	static void inorder(Node root, LinkedList<Integer> v) {
		if(root!=null) {
			inorder(root.left, v);
			v.add(root.data);
			inorder(root.right, v);
		}
	}
	
	static Node buildBalancedTree(Node root) {
		LinkedList<Integer> v = new LinkedList<Integer>();
		inorder(root, v);
		Node temp;
		temp = make(v, 0, v.size()-1);
		return temp;
		
	}
	private static Node make(LinkedList<Integer> v, int i, int j) {
		// TODO Auto-generated method stub
		if(i>j || i<0)
			return null;
		
			int mid = ((i+j)/2);
			Node root = new Node(v.get(mid));
			root.left = make(v, i, mid-1);
			root.right = make(v, mid+1, j);
			return root;
			
	}
	static int height(Node root) {
		if(root==null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			if(lheight<rheight)
				return (rheight+1);
			else
				return (lheight+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-->0) {
			int n = Integer.parseInt(sc.next());
			Node root = new Node(Integer.parseInt(sc.next()));
			
			for(int i=1; i<n; i++) {
				 root = insertData(root, Integer.parseInt(sc.next()));
			}
			
			root = buildBalancedTree(root);
			
			System.out.println(height(root));
		}
		sc.close();
	}
}
