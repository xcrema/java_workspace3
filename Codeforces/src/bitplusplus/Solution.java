package bitplusplus;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n");
		int n = Integer.parseInt(sc.next());
		if(n>=1 && n<=150) {
			int result = 0;
			while(n-->0) {
			String s = sc.next();
			//System.out.println(s);
			if(s.equals("X++") || s.equals("++X"))
				result+=1;
			else if(s.equals("X--") || s.equals("--X"))
				result-=1;
			}
			System.out.println(result);
		}
		sc.close();
	}
}
