package quick_sort;
import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = {5, 4, 3, 2, 1};
		
		
		QuickSort(arr, 0, 4);
		for(int i=0; i<5; i++)
			System.out.println(arr[i]);
		sc.close();
	}

	private static void QuickSort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i<j) {
			int pi = partition(arr, i, j);
			QuickSort(arr, i, pi-1);
			QuickSort(arr, pi+1, j);
		}
		
	}

	private static int partition(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int k = i-1;
		int pivot = arr[j];
		for(int l=i; l<j; l++) {
			if(arr[l]<pivot) {
				k++;
				int temp = arr[l];
				arr[l] = arr[k];
				arr[k] = temp;
			}
		}
		int temp = arr[k+1];
		arr[k+1] = arr[j];
		arr[j] = temp;
		return k+1;
	}

}
