package next_round;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(n>=1 && k>=1 && n<=50 && k<=50 && k<=n) {
			int []arr = new int[n];
			int flag = 0;
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0; i<n; i++) {
				if(arr[i]<0) {
					flag = 1;
					break;
				}				
			}
			int count = 0;
			if(flag == 0) {
			flag = 1;
			for(int i=0; i<n; i++) {
				if(arr[i]>=1 && arr[i]<=100) {
					flag = 0;
					break;
				}
			}
			
			
			if(flag == 0) {
			for(int i=0; i<n; i++)
				if(arr[i]>=arr[k-1] && arr[i]>0)
					count++;
			}
			}
			System.out.println(count);
			
		}
	}
}
