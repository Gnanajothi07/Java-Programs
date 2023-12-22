import java.util.*;
public class FindMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		System.out.print(max(arr,1,4));
		
	}
	static int max(int[] arr,int start,int end) {
			int maxVal=arr[start];
		for(int i=start;i<=end;i++) {
			if(arr[i]>maxVal) {
				maxVal=arr[i];
			}
		}
		return maxVal;
		
	}
}
