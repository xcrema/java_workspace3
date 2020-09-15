package reorder_list;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}
public class Solution {
	static Node head;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t-->0) {
			int n = Integer.parseInt(sc.next());
			head = new Node(sc.nextInt());
			Node temp = head;
			
			for(int i=0; i<n-1; i++) {
				temp.next = new Node(sc.nextInt());
				temp = temp.next;
			}
			
			reorderList(head);
			
			while(head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
	}
	
	static Node findLast(Node node) {
		
		if(node.next == null)
			return null;
		
		if(node.next.next == null) {
			return node;
		}
		
		return findLast(node.next);
		
	}
	private static void reorderList(Node head) {
		// TODO Auto-generated method stub
		
		
		Node temp = findLast(head);
		
		if(temp!=null && head!=temp) {
		
			Node temp1 = head.next;
			head.next = temp.next;
			temp.next = null;
			head.next.next = temp1;
			
			head = temp1;
	
		reorderList(head);
		}
		else
			return;
	}
}
