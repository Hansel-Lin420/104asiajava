package 第一學期;

import java.util.*;

public class Ex58 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		while (n > 0) {
			n = n - i;
			i++;
			if (n == 0) {
				System.out.print(i-1);
			}
			if (n < 0) {
				System.out.print(i - 2);
			}
		}

	}

}
