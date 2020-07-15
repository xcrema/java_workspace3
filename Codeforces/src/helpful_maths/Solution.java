package helpful_maths;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String arr[] = s.split("[+]");
		/*
		for (int i = 0; i < arr.length; i++) {
			System.osut.println(arr[i]);
		}
		*/
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0; i<arr.length; i++)
			list.add(Integer.valueOf(arr[i]));
		list.sort(null);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			if(i!=list.size()-1)
				System.out.print("+");
		}
		
		sc.close();
	}
}
