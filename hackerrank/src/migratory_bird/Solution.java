package migratory_bird;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		//int [] arr = new int[n];
		Map<Integer, Integer> map = new TreeMap<>();
		
		for(int i=0; i<n; i++) {
			int temp = sc.nextInt();
			if(map.containsKey(temp)) {
				int count = map.get(temp);
				map.put(temp, count+1);
			}
			else {
				map.put(temp, 1);
			}
		}
		
		Map.Entry<Integer, Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		System.out.println(maxEntry.getKey());
		sc.close();
	}
}
