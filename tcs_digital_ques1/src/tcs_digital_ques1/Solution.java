//package tcs_digital_ques1;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int r[] = new int[3];
			int v[] = new int[3];
			
			for(int i=0; i<3; i++)
				r[i] = sc.nextInt();
			
			for(int i=0; i<3; i++)
				v[i] = sc.nextInt();
			
			int tim = sc.nextInt();
			
			int []res = new int[3];
			for(int i=0; i<3; i++) {
				res[i] = tim*v[i];
				if(res[i]%360 == 0)
					res[i] = 0;
				if(res[i]>360)
					res[i] = (int) (((double)res[i]/360 - 1)*360);
			}
			
			if(res[0] == res[1]&& res[1] == res[2])
				System.out.print("TRUE");
			else
				System.out.print("FALSE");
		}
		sc.close();
	}
}
