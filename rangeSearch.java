import java.util.*;

public class rangeSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int target=sc.nextInt();
	
		
		boolean ans=search(arr,target,2,5);
		System.out.print(ans);
	}
	static boolean search(int[] arr,int target,int start,int end) {
		if(arr.length==0) { 
			return false;
		}
		for(int a = start;a<=end;a++) {
			int element=arr[a];
			if(element==target) {
				return true;
			}
		}
		return false;
	}
}
