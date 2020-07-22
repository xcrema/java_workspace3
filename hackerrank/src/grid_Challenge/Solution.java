package grid_Challenge;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t-->0) {
			int n = Integer.parseInt(sc.next());
			String [][] grid = new String[n][];
			for(int i=0; i<n; i++) {
				grid[i] = sc.next().split("");
				Arrays.sort(grid[i]);
			}
			boolean flag = true;
			for(int i=0; i<grid[0].length; i++) {
				String s1 = null;
				String [] temp = new String[n];
				
				for(int j=0; j<n; j++) {
					s1+=(grid[j][i]);
					temp[j] = grid[j][i];
				}
				Arrays.sort(temp);
				String s2 = null;
				
				for(int j=0; j<n; j++) {
					s2+=(temp[j]);
				}
				
				if(!s1.equals(s2)) {
					flag = false;
					break;
				}
			}
			
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
