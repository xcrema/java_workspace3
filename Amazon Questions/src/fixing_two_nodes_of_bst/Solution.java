package fixing_two_nodes_of_bst;
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

class pair{
	int first;
	int second;
	pair(int first, int second){
		this.first = first;
		this.second = second;
	}
}
class Solution{
	static Node buildTree(String str) {
		if(str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}
		
		String ip[] = str.split(" ");
		
		Node root = new Node(Integer.parseInt(ip[0]));
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		int i=1;
		
		while(queue.size()>0 && i<ip.length) {
			
			Node currNode = queue.peek();
			queue.remove();
			
			String currVal = ip[i];
			
			if(!currVal.equals("N")) {
				currNode.left = new Node(Integer.parseInt(currVal));
				
				queue.add(currNode.left);
			}
			
			i++;
			if(i>=ip.length)
				break;
			
			currVal = ip[i];
			
			if(!currVal.equals("N")) {
				currNode.right = new Node(Integer.parseInt(currVal));
				
				queue.add(currNode.right);
			}
			
			i++;
		}
		
		return root;
	}
	
	static void printInorder(Node root) {
		if(root==null)
			return;
		
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	
	//not understood!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static boolean isBST(Node n, int lower, int upper) {
		
		if(n==null)
			return true;
		if(n.data<=lower || n.data>=upper)
			return false;
		return(isBST(n.left, lower, n.data)&& isBST(n.right, n.data, upper));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t-->0) {
			String s = sc.next();
			Node root = buildTree(s);
			
			Node duplicate = buildTree(s);
			
			Sol g = new Sol();
			
			root = g.correctBST(root);
			
			if(!isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
				System.out.println(0);
				continue;
			}
			
			ArrayList<pair> mismatch = new ArrayList<pair>();
			
			if(compare(root, duplicate, mismatch) == false) {
				System.out.println(0);
				continue;
			}	
			
			if(mismatch.size()!=2 || mismatch.get(0).first != mismatch.get(1).second || mismatch.get(1).first != mismatch.get(0).second)
				System.out.println(0);
			
			else
				System.out.println(1);
			
		}
		sc.close();
	}

	private static boolean compare(Node a, Node b, ArrayList<pair> mismatch) {
		// TODO Auto-generated method stub
		if(a==null && b==null)return true;
		if(a==null || b==null)return false;
		
		if(a.data != b.data) {
			pair temp = new pair(a.data, b.data);
			mismatch.add(temp);
		}
		return (compare(a.left, b.left, mismatch) && compare(a.right, b.right, mismatch));
	}
}

class Sol{
	
	Node prev=null, first=null, second=null;
	
	public void findDefect(Node root) {
		if(root==null)
			return;
		
		findDefect(root.left);
		
		if(prev!=null && root.data<prev.data) {
			if(first == null)
				first = prev;
			
			second = root;
		}
		
		findDefect(root.right);
	}
	public Node correctBST(Node root) {
		
		
		findDefect(root);
		int temp = first.data;
		first.data = second.data;
		second.data = temp;
		
		return root;
	}
}

