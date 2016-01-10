package 第一學期;

import java.util.*;

public class Ex85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1;int b = 1;
		int[][] data = new int[n][n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {

					data[i][j] = a;
					a++;
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					data[i][j] = a;
					a++;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		for (int j = 0; j < n; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < n; i++) {

					data[i][j] = b;
					b++;
				}
			} else {
				for (int i = n - 1; i >= 0; i--) {
					data[i][j] = b;
					b++;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
