//package serejaanddima;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		int i=0, j=n-1;
		int srija=0;
		int dima=0;
		
		
		while(i<=j) {
			if(arr[i]>arr[j]) {
				srija+=arr[i];
				i++;
			}
			else {
				srija+=arr[j];
				j--;
			}
			if(i>j)
				break;
			if(arr[i]>arr[j]) {
				dima+=arr[i];
				i++;
			}
			else {
				dima+=arr[j];
				j--;
			}
		
		}
		
		System.out.println(srija+" "+dima);
		sc.close();
	}
}
