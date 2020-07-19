package cisco_barber_problem;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> start_time = new ArrayList<Integer>();
		List<Integer> end_time = new ArrayList<Integer>();
		List<Integer> fees = new ArrayList<Integer>();
		
		while(n-->0) {
			start_time.add(Integer.parseInt(sc.next()));
			end_time.add(Integer.parseInt(sc.next()));
			fees.add(Integer.parseInt(sc.next()));
		}
		
		System.out.println(barber(start_time, end_time, fees));
		sc.close();
	}

	private static List<Integer> barber(List<Integer> start_time, List<Integer> end_time, List<Integer> fees) {
		// TODO Auto-generated method stub
		
		List<Integer> ind = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<start_time.size(); i++) {
			List<Integer> indTemp = new ArrayList<Integer>();
			int maxTemp = fees.get(i);
			indTemp.add(i);
			
			for(int j=i+1; j<end_time.size(); j++) {
				if(start_time.get(j) > end_time.get(i)) {
					maxTemp+=fees.get(j);
					indTemp.add(j);
				}
			}
			
			if(max<maxTemp) {
				max = maxTemp;
				ind = indTemp;
			}
		}
		
		List<Integer> result = new ArrayList<Integer>();
		
		result.add(fees.size() - ind.size());
		
		for(int i=0; i<ind.size(); i++) {
			fees.remove(fees.get(ind.get(i)));
		}

		max = 0;
		
		for(int i=0; i<fees.size(); i++){
			max+=fees.get(i);
		}
		
		result.add(max);
		return result;
	}
}


/*
3
900
1030
100
1000
1200
500
1100
1200
300
*/