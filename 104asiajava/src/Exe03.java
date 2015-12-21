import java.util.*;

public class Exe03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fun(n);
	}

	private static void fun(int x) {
		// TODO Auto-generated method stub
		String str = "";
		int sum = 0;
		int count = 0;
		for (int i = 1; i < x; i++) {
			sum = 0;
			str = "" + i;
			int j = i;
			while (sum < x) {
				sum += j++;
				if (sum < x) {
					str += "+" + j;
				}
			}
			if (sum == x) {
				count++;
				System.out.println(str);
			}
		}
		if (count == 0) {
			System.out.println("No");
		}
	}
}