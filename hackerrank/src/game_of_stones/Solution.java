package game_of_stones;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n-->0) {
			int x = sc.nextInt();
			System.out.println(whoWon(x, "First"));
		}
		sc.close();
	}

	private static String whoWon(int x, String name) {
		if(x<2) {
			if(name.equals("First"))
				return "Second";
			else
				return "First";
		}
		else {
			int x1 = x-2;
			int x2 = x-3;
			int x3 = x-5;
			LinkedList<String> winner = new LinkedList<String>();
			if(name.equals("First"))
				winner.add(whoWon(x1, "Second"));
			else
				winner.add(whoWon(x1, "First"));
			
			if(name.equals("First"))
				winner.add(whoWon(x2, "Second"));
			else
				winner.add(whoWon(x2, "First"));
			
			if(name.equals("First"))
				winner.add(whoWon(x3, "Second"));
			else
				winner.add(whoWon(x3, "First"));
			
			
			
			if(name.equals("First")) {
			int count=0;
			for(int i=0; i<winner.size(); i++)
				if(winner.get(i).equals("First"))
					count++;
			
			if(count!=0)
				return "First";
			else
				return "Second";
			}
			
			else {
				int count=0;
				for(int i=0; i<winner.size(); i++)
					if(winner.get(i).equals("Second"))
						count++;
				
				if(count==0)
					return "First";
				else
					return "Second";
			}
		}
	}
}
