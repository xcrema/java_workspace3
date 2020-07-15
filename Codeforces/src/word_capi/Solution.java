package word_capi;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String []str = s.split("");
		if(!Character.isUpperCase(s.charAt(0)))
			str[0] = String.valueOf(Character.toUpperCase(s.charAt(0)));
		for(int i=0; i<str.length; i++)
			System.out.print(str[i]);
		sc.close();
	}
}
