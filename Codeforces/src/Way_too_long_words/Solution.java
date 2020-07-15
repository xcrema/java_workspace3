package Way_too_long_words;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=1 && n<=100) {
			while(n-->0) {
				String s = sc.next();
				if(s.length()>=1 &&s.length()<=100) {
					if(s.length()>10) {
						String temp = Integer.toString((s.length()-2));
						s = String.valueOf(s.charAt(0)) + temp + String.valueOf(s.charAt(s.length()-1));
					}
					System.out.println(s);
				}
				
			}
		}
	}
}
