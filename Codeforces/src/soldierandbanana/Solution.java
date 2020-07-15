package soldierandbanana;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int amt = w*(w+1)/2*k;
		if(amt>n)
			System.out.println(amt-n);
		else
			System.out.println("0");
		
		
		sc.close();
	}
}
