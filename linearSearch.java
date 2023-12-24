import java.util.*;
public class LinearSearching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		char target = sc.next().charAt(0);
		boolean ans = linearSearch(name,target);
		System.out.print(ans);
	}
	static boolean linearSearch(String name,char target) {
		for(char ch : name.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		return false;
	}
}
