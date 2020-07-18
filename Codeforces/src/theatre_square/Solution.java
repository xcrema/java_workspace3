package theatre_square;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		
		int area1 = n*m;
		double num = (double)area1/(a*a);
		System.out.println(Math.ceil(num));
		sc.close();
	}
}
