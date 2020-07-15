package lucky_num;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		boolean flag = true;
		/*
		for(int i=0; i<s.length; i++)
			if(!s[i].equals("7")) 
				if(!s[i].equals("4"))
					flag = false;
		*/
		int count=0;
		for(int i=0; i<s.length; i++) {
			if(s[i].equals("7") || s[i].equals("4"))
				count++;
		}
		if(count==4 || count==7)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}
