import java.util.*;
public class Findmin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int a=min(arr);
		System.out.print(a);
	}
	static int min(int[] arr) {
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			int min = arr[i];
			if(ans>min) {
				ans=min;
			}
		}
		return ans;
	}
}
