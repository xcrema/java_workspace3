package Watermelon;

import java.util.*;

public class Watermelon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=1 && n<=100) {
			if(n == 2 || n%2!=0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
