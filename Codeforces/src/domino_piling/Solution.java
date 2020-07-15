package domino_piling;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		if(m>=1 && m<=16 && n>=1 && n<=16) {
			int area = m*n;
			System.out.println(area/2);
		}
	}
}
