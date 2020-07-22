package luck_balance;
import java.util.*;

public class Solution implements Comparable<Solution>{

	int l, t;
	
	@Override
	public int compareTo(Solution comp) {
		// TODO Auto-generated method stub
		return -this.l+comp.l;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Solution []chart = new Solution[n];
		
		for(int i=0; i<n; i++) {
			chart[i] = new Solution();
			chart[i].l = Integer.parseInt(sc.next());
			chart[i].t = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(chart);
		
		int maxLuck = 0;
		
		for(int i=0; i<n; i++) {
			if(chart[i].t == 1) {
				if(k>0) {
				maxLuck+=chart[i].l;
				k--;
				}
				else {
					maxLuck-=chart[i].l;
				}
			}
			else if(chart[i].t == 0)
				maxLuck+=chart[i].l;
		}
		
		System.out.println(maxLuck);

	}
}
