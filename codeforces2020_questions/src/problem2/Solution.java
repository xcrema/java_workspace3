package problem2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T-->0) {
			
			int N = sc.nextInt();
			if(N>=1 && N<=100000) {
				
				//long arr1[] = new long[N];
				//long arr2[] = new long[N];
				PriorityQueue<Long> arr1 = new PriorityQueue<>();
				PriorityQueue<Long> arr2 = new PriorityQueue<>();
				
				boolean check = true;
				
				for(int i=0; i<N; i++) {
					long temp = sc.nextLong();
					arr1.add(temp);
					if(temp<0)
						check = false;
				}
				
				for(int i=0; i<N; i++) {
					long temp = sc.nextLong();
					arr2.add(temp);
					if(temp<0)
						check = false;
				}
				
				if(check) {
					
					int count = 0;
					Iterator<Long> it = arr1.iterator();
					while(it.hasNext()) {
						
						long temp = arr1.poll();
						
						Iterator<Long> it2 = arr2.iterator();
						
						while(it2.hasNext()) {
							
							long temp2 = it2.next();
							if(temp>temp2) {
								count++;
								arr2.remove(temp2);
								break;
							}
						}
					}
					System.out.println(count);
				}
			}
		}
		
		sc.close();
	}
}
