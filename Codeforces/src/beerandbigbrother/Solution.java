package beerandbigbrother;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n<=m) {
		int i=0;
		while(true) {
			if(n<=m) {
				i++;
				n*=3;
				m*=2;
			}
			else
				break;
		}
		System.out.println(i);
		}
		sc.close();
	}
}
