
public class Main {
	public static void main(String[] args) {
		pattern1(5);
		
	}
	static void pattern1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(col%2==1)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
	}
}
