package queueattheschool;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		String[] queue = sc.next().split("");
		
		for(int i=0; i<t; i++) {
			for(int j=0; j<n-1;) {
				if(queue[j].equals("B") && queue[j+1].equals("G")) {
					queue[j] = "G";
					queue[j+1] = "B";
					j+=2;
				}
				else
					j++;
			}
		}
		for(int i=0; i<n; i++)
			System.out.print(queue[i]);
		sc.close();
	}
}
