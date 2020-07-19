package knapsack_problem;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int []weight = new int[n];
		int []price = new int[n];
		
		for(int i=0; i<n; i++) {
			price[i] = sc.nextInt();

			weight[i] = sc.nextInt();
		}
		
		double []arr = new double[n];
		
		for(int i=0; i<n; i++)
			arr[i] = (double)price[i]/weight[i];
		
		double maxPrice = 0;
		int i;
		double []arr2 = new double[n];
		while(w>0) {
			int ind = 0;
			double max = Integer.MIN_VALUE;
			for(i=0; i<n; i++) {
				if(max<arr[i]) {
					max = arr[i];
					
					ind = i;
				}
			}
			
			arr[ind] = -1;
			
			//maxPrice+=max*price[i-1];
			if(w>=weight[ind]) {
				arr2[ind] = 1;
			}
			else
				arr2[ind] = (double)w/weight[ind];
			
			w-=arr2[ind]*weight[ind];
		}
		
		for(i=0; i<n; i++)
			maxPrice+=arr2[i]*price[i];
		
		System.out.println(maxPrice);
		sc.close();
	}
}
/*
7 15
10 2
5 3 
15 5
7 7
6 1
18 4
3 1
*/
