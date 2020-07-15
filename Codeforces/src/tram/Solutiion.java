package tram;
import java.util.*;
public class Solutiion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int curr = 0;
		int cap = Integer.MIN_VALUE;
		while(n-->0) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			curr = curr - out + in;
			if(cap<curr)
				cap = curr;
		}
		System.out.println(cap);
		sc.close();
	}
}
