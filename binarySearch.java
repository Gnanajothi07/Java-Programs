import java.util.*;
public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = 33;
		int ans = binarySearch(arr,target);
		System.out.print(ans);
	}
	static int binarySearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		int mid=start+(end-start)/2;
		while(start<=end) {
			if(target==arr[mid]) {
				return mid;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
				
			}
			
		}
		return -1;
		
	}
	
}
