package bon_appetit;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int bill[] = new int[n];
		
		for(int i=0; i<n; i++){
			bill[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<n; i++)
			if(i!=k)
				sum+=bill[i];
		
		if(sum/2 == b)
			System.out.println("Bon Appetit");
		else
			System.out.println(b-sum/2);
		String a = "Hello";
		System.out.println(a.charAt(7));
		sc.close();
	}
}
