package a_customer_wishes_to_withdraw;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n2000 = sc.nextInt();
		int n500 = sc.nextInt();
		int n100 = sc.nextInt();
		int n20 = sc.nextInt();
		int amt = sc.nextInt();
		int sum = 0;
		int arr[] = new int[4];
		//while(sum<amt) {
		if(n2000 > 0 && sum+2000 <= amt) {
			int temp = (amt-sum)/2000;
			if(temp<=n2000) {
				arr[0] = temp;
				sum+=arr[0]*2000;
			}
		}
		if(n500 > 0 && sum+500 <= amt) {
			int temp = (amt-sum)/500;
			if(temp<=n500) {
				arr[1] = temp;
				sum+=arr[1]*500;
			}
			
		}
		if(n100 > 0 && sum+100 <= amt) {
			int temp = (amt-sum)/100;
			if(temp<=n100) {
				arr[2] = temp;
				sum+=arr[2]*100;
			}
		}
		if(n20 > 0 && sum+20 <= amt) {
			int temp = (amt-sum)/20;
			if(temp<=n20) {
				arr[3] = temp;
				sum+=arr[3]*20;
			}
		}
		
		if(sum == amt)
			for(int i=0; i<4; i++)
				System.out.print(arr[i]+" ");
		else
			System.out.println("0");
		//}
		sc.close();
	}

}
