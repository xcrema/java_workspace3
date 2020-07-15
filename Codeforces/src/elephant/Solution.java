package elephant;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		int k=5;
		while(n>0) {
			if(n/k >= 1) {
				count+=n/k;
				n-=n/k*k;
			}
			k--;
		}
		System.out.println(count);
	}
}
