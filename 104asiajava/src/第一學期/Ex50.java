package 第一學期;

import java.util.Scanner;

public class Ex50 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String str = "";
		int sum = 0;
		int count = 0;
		for (int i = 1; i < n; i++) {
			sum = 0;
			str = "" + i;
			int j = i;
			while (sum < n) {
				sum += j++;
				if (sum < n) {
					str += "+" + j;
				}
			}
			if (sum == n) {
				count++;
				System.out.println(str);
			}
		}
		if (count == 0) {
			System.out.println("找不出該數列");
		}
	}
}