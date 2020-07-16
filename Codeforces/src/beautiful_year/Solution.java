package beautiful_year;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		while(true) {
			HashSet<Character> set = new HashSet<Character>();
			int temp = Integer.parseInt(n);
			temp++;
			n = String.valueOf(temp);
			for(int i=0; i<n.length(); i++)
				set.add(n.charAt(i));
			if(set.size()==4) {
				System.out.println(n);
				break;
			}
		}
		
		sc.close();
	}
}
