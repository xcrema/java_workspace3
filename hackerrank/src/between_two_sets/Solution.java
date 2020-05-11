package between_two_sets;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
			if(max<arr1[i])
				max = arr1[i];
		}
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
			if(min>arr2[i])
				min = arr2[i];
		}
		boolean check = true;
		int count = 0;
		for(int i=max; i<=min; i++) {
			
			for(int j=0; j<n; j++) {
				if(i%arr1[j] != 0)
					check = false;
			}
			if(check) {
				for(int j=0; j<m; j++) {
					if(arr2[j]%i != 0)
						check = false;
				}
			}
			if(check)
				count++;
			check = true;
		}
		System.out.println(count);
		sc.close();
	}
}
