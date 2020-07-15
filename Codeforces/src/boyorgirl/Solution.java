package boyorgirl;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		HashSet<String> map = new HashSet<String>();
		for(int i=0; i<s.length; i++)
			map.add(s[i]);
		if(map.size()%2 != 0)
			System.out.println("IGNORE HIM!");
		else
			System.out.println("CHAT WITH HER!");
		sc.close();
	}
}
