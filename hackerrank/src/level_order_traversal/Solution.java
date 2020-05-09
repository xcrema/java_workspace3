package level_order_traversal;
import java.util.*;


class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	
	public static int height(Node root) {
		if(root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			if(lheight >rheight)
				return (lheight+1);
			else 
				return (rheight+1);
		}
	}

	public static void levelOrder(Node root) {
		int height = height(root);
		for(int i=1; i<=height; i++)
			displayLevelOrder(root, i);
		
	}
	private static void displayLevelOrder(Node root, int level) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		if(level == 1)
			System.out.println(root.data+" ");
		else {
			displayLevelOrder(root.left, level-1);
			displayLevelOrder(root.right, level-1);
		}
	}

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}