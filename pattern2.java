import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		pattern2(row,col);
		
	}
	static void pattern2(int row, int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1||j==1|| i==row||j==col)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
	}
}
