package HW;

import java.util.*;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("999為到達不了.0為自己.");
		int k, i, j;
		int inf = 999;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = 7;
		int e[][] = new int[10][10];

		for (i = 1; i <= n + 1; i++) {
			for (j = 1; j <= n + 1; j++) {
				if (i == j) {
					e[i][j] = 0;
				} else {
					e[i][j] = inf;
				}
			}
		}
		for (i = 1; i <= m; i++) {
			int t1 = scn.nextInt();
			int t2 = scn.nextInt();
			int t3 = scn.nextInt();
			e[t1][t2] = t3;
		}
		for (k = 1; k <= n + 1; k++) {
			for (i = 1; i <= n + 1; i++) {
				for (j = 1; j <= n + 1; j++) {
					if (e[i][j] > e[i][k] + e[k][j]) {
						e[i][j] = e[i][k] + e[k][j];
					}
				}
			}
		}
		System.out.println("　　　"+"1\t" + "2\t" + "3\t" + "4\t" + "5");
		System.out.println("=========================================");
		for (i = 1; i <= n + 1; i++) {
			System.out.print(i + "||");
			for (j = 1; j <= n + 1; j++) {
				System.out.print(e[i][j] + "\t");
			}
			
			System.out.print("\n");
		}
	}

}
