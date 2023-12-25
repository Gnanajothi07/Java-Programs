import java.util.*;
public class TwoarraySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int target=sc.nextInt();
		int[] ans = Search(arr,target);
		System.out.print(Arrays.toString(ans));
	}
	static int[] Search(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col}; //there is no object created for row and col  
				}
			}
		}
		return new int[]{-1,-1};
	}
}
