package electronics_shop;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []board = new int[n];
		int []usb = new int[m];
		for(int i=0; i<n; i++)
			board[i] = sc.nextInt();
		for(int i=0; i<m; i++)
			usb[i] = sc.nextInt();
		
		int max = -1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				int amt = board[i]+usb[j];
				if(amt>max && amt<=b)
					max = amt;
			}
		}
		System.out.println(max);
		sc.close();
	}
}
