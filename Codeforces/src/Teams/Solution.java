package Teams;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=1 && n<=1000) {
			int result = 0;
			while(n-->0) {
				int count = 0;
				for(int i=0; i<3; i++) {
					if(sc.nextInt() == 1)
						count++;
				}
				if(count>=2)
					result++;
			}
			System.out.println(result);
		}
		sc.close();
	}
}
