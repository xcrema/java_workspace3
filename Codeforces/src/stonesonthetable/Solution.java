package stonesonthetable;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = sc.next().split("");
		int count=0;
		for(int i=0; i<s.length-1; i++)
		{
			if(s[i].equals(s[i+1]))
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}
