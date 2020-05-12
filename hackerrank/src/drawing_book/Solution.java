package drawing_book;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int countFront = p/2;
		int countBack = -1;
		if(n%2 == 0)
			countBack = ((n-p)+1)/2;
		else
			countBack = (n-p)/2;
		if(countFront<countBack)
			System.out.println(countFront);
		else
			System.out.println(countBack);
		sc.close();
	}
}
