package sock_merchant;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int arr[] = new int[n];
		Map<Integer, Integer> arr = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			int temp = sc.nextInt();
			if(arr.containsKey(temp)) {
				int value = arr.get(temp);
				arr.put(temp, value+1);
			}
			else {
				arr.put(temp, 1);
			}
		}
		int count = 0;
		 for (Map.Entry<Integer,Integer> entry : arr.entrySet()) {
			 count += entry.getValue()/2;
		 }
		 System.out.println(count);
		sc.close();
	}
}
