package translation;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder s1 = new StringBuilder(sc.next());
		StringBuilder s2 = new StringBuilder(sc.next());
		
		s1 = s1.reverse();
		
		if(s1.toString().equals(s2.toString()))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
