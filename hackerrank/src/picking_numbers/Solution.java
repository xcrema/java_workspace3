package picking_numbers;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0; i<n; i++)
			list.add(sc.nextInt());
		list.sort(null);
		int count=0;
		for(int i=0; i<n-1; i++) {
			int temp = 1;
			for(int j=i+1; j<n; j++) {
				if(list.get(i) == list.get(j) || list.get(j) == list.get(i)+1)
					temp++;
			}
			if(temp>count)
				count = temp;
			temp = 0;
		}
		
		System.out.println(count);
		sc.close();
	}
}
