package geogeandaccomodation;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n = sc.nextInt();
		while(n-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((b-a) >= 2)
				result++;
		}
		System.out.println(result);
	}
}
