package antonanddanik;
import java.util.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		
		Pattern pattern = Pattern.compile("A");
		Matcher match = pattern.matcher(s);
		long countA = match.results().count();
		
		Pattern patt = Pattern.compile("D");
		Matcher mat = patt.matcher(s);
		long countD = mat.results().count();
		
		
		
		if(countA==countD)
			System.out.println("Friendship");
		else if(countA>countD)
			System.out.println("Anton");
		else
			System.out.println("Danik");
			
	}
}
