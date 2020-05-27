package egyptian_fraction;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator: ");
		int nr = sc.nextInt();
		System.out.println("Enter Denominator: ");
		int dr = sc.nextInt();
		
		egyFraction(nr, dr);
		
		sc.close();
	}

	private static void egyFraction(int nr, int dr) {
		// TODO Auto-generated method stub
		if(nr==0 || dr==0)
			return;
		
		if(dr%nr == 0) {
			System.out.println("1/"+dr/nr);
			return;
		}
		if(nr%dr == 0) {
			System.out.println(nr/dr);
			return;
		}
		if(nr>dr) {
			System.out.println(nr/dr+"+");
			egyFraction(nr%dr, dr);
			return;
		}
		
		int n = dr/nr + 1;
		System.out.println("1/"+n+"+");
		egyFraction(nr*n-dr, dr*n);
		
	}
}
