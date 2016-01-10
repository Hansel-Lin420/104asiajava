package 第一學期;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		C(m, n);
	}

	private static void C(int m, int n) {
		// TODO Auto-generated method stub
		int sum = 1;
		for (int i = 1; i <= m; i++) {
			sum *= i;

		}
		int sum1 = 1;
		for (int i = 1; i <= n; i++) {
			sum1 *= i;

		}
		int sum2 = 1;
		for (int i = 1; i <= (m - n); i++) {
			sum2 *= i;

		}
		System.out.println(sum / (sum1 * sum2));
	}

}
