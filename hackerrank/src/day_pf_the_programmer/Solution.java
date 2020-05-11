package day_pf_the_programmer;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year==1918)
			System.out.println("26.09.1918");
		if(year>1917 && year<=2700) {
		if((year%4==0 && year%100 != 0) || year%400 == 0)
			System.out.println("12.09."+year);
		else
			System.out.println("13.09."+year);
		}
		else if(year>=1700 && year<=1917){
			if(year%4==0)
				System.out.println("12.09."+year);
			else
				System.out.println("13.09."+year);
		}
		sc.close();
	}
}
