package longest_factorial;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}

	private static String factorial(int n) {
		// TODO Auto-generated method stub
		if(n <= 1)
			return "1";
		else {
			String res = "";
			
			String a = new StringBuilder(String.valueOf(n)).reverse().toString();
			String b = new StringBuilder(factorial(n-1)).reverse().toString();
			
			int arr[] = new int[a.length()+b.length()];
			
			for(int i=0; i<a.length(); i++) {
					for(int j=0; j<b.length(); j++) {
						arr[i+j] = arr[i+j] + (a.charAt(i) - '0')*(b.charAt(j) - '0');
					}
			}
			
			for(int i=0; i<arr.length; i++) {
					int digit = arr[i]%10;
					int carry = arr[i]/10;
					
					if(i+1 < arr.length)
						arr[i+1] += carry;
					
					res = digit+res;
			}
			
			int ind = 0;
			
			while(res.charAt(ind) - '0' == 0) {
				ind++;
			}
			
			res = res.substring(ind);
			
			return res;
			
		}
	}
}
