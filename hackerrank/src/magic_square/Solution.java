package magic_square;
import java.util.*;

public class Solution {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][]mat = new int[3][3];
		
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				mat[i][j] = sc.nextInt();
		
		int []row_sum = new int[3];
		int []col_sum = new int[3];
		int []dia_sum = new int[2];
		
		for(int i=0; i<3; i++) {
			row_sum[i] = 0;
			col_sum[i] = 0;
		}
		
		dia_sum[0] = mat[0][0]+mat[1][1]+mat[2][2];
		dia_sum[1] = mat[0][2]+mat[1][1]+mat[2][0];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				row_sum[i]+=mat[i][j];
				col_sum[i]+=mat[j][i];
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<3; i++) {
			if(max<row_sum[i])
				max = row_sum[i];
		}
		
		for(int i=0; i<3; i++) {
			if(max<col_sum[i])
				max = col_sum[i];
		}
		for(int i=0; i<2; i++) {
			if(max<dia_sum[i])
				max = dia_sum[i];
		}
		
		
		int result = 0;
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				if(i==j) {
					if(j==1 && j==1 && row_sum[i] == col_sum[j] && row_sum[i] == dia_sum[0] ) {
						
					}
					else if(row_sum[i] == col_sum[j] && row_sum[i] == dia_sum[0])
						continue;
					else {
						result+=max-mat[i][j];
						mat[i][j] = max;
					}
				}
				else if(i==0 && j==2 || i==1 && j==1 )
				if(i!=j) {
					
					if(row_sum[i] != col_sum[j]) {
						
					}
				}
			}
		}
		
		for(int i=0; i<3; i++)
			System.out.print(row_sum[i]+" ");
		System.out.println("");
		for(int i=0; i<3; i++)
			System.out.print(col_sum[i]+" ");
		System.out.println("");
		for(int i=0; i<2; i++)
			System.out.print(dia_sum[i]+" ");
		sc.close();
	}
}
