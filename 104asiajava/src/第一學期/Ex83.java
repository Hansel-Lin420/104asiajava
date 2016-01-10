package 第一學期;

import java.util.*;

public class Ex83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] data = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					data[i][j] = 1;
				} else if (j == 0) {
					data[i][j] = data[i - 1][j] + i;
				} else if (i + j < n) {
					data[i][j] = data[i][j - 1] + j + 1 + i;
				} 
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == n - 1 && j == n - 1) {
					data[i][j] = n * n;
				} else if (j == n - 1) {
					data[i][j] = data[i + 1][j] - (n - i - 1);
				} else if (i + j >= n) {
					data[i][j] = data[i][j + 1] - 2 * n + i + j + 1;
				}
			}
		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
