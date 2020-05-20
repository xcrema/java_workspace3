package activity_selection_problem;

import java.util.*;

public class Solution {
	static Scanner sc = new Scanner(System.in);

	static class Activity implements Comparable<Activity>{
		int start, end;
		
		Activity(){
			start = sc.nextInt();
			end = sc.nextInt();
		}
		public int compareTo(Activity a) {
			if(end-a.end<0)
				return -1;
			else
				return 1;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter no. of activities: ");
		int n = sc.nextInt();
		
		System.out.println("Enter Activities: ");
		ArrayList<Activity> act = new ArrayList<Activity>();
		
		
		for (int i = 0; i < n; i++)
			act.add(new Activity());
		
		Collections.sort(act);
		
		/*for(int i=0; i<n; i++) {
			System.out.println(act.get(i).start+" "+act.get(i).end);
		*/
		
		ActivitySelection(act);
		
		}
	private static void ActivitySelection(ArrayList<Activity> act) {
		// TODO Auto-generated method stub
		int count = 0;
		int size = act.size();
		int prevEnd = -1;
		
		for(int i=0; i<size; i++) {
			if(i==0) {
				count++;
				prevEnd = act.get(i).end;
				continue;
			}
			if(prevEnd<=act.get(i).start) {
				count++;
				prevEnd = act.get(i).end;
			}
		
		}
		
		System.out.println("Number of activities that can be performed: "+count);
	}
	
}
