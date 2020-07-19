package the_power_sum;
import java.util.*;

public class Solution {
	
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int result = methodOne(x, n, 1);
		System.out.println(result);
		sc.close();
	}

	private static int methodOne(int x, int n, int i) {
		
		if((int)Math.pow(i, n) < x) {
			return methodOne(x, n, i+1) + methodOne(x-(int)Math.pow(i, n), n, i+1);
		}
		else if((int)Math.pow(i, n) == x)
			return 1;
		else
			return 0;
		
		
	}
}
