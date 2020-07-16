package word;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Pattern pattern = Pattern.compile("[a-z]");
		Matcher matcher = pattern.matcher(s);
		
		long matches = matcher.results().count();
		
		if(matches>=(double)s.length()/2)
			s = s.toLowerCase();
		else
			s = s.toUpperCase();
		System.out.println(s);
			
		sc.close();
	}
}
