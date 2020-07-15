package beautiful_mat;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(sc.hasNext()) {
			count++;
			if(sc.next().equals("1"))
				break;
		}
		//System.out.println(count);
		int r = (int) Math.ceil((double)count/5);
		int c = count-(r-1)*5;
		int result = Math.abs(r-3)+Math.abs(c-3);
		System.out.println(result);
	
		sc.close();
	}
}
