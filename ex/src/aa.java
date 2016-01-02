package src;

import java.io.*;

public class aa {
	public static void main(String args[]) throws IOException {
		int[] arr0 = { 0, 0, 1, 2, 7, 2, 6, 3, 6 };
		int[] arr1 = { 0, 3, 9, 4, 1, 2, 2, 0, 1 };
		int[] arr2 = { 0, 9, 4, 5, 8, 6, 3, 5, 6 };
		System.out.print("請輸入一組發票號碼：");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String play = buf.readLine();
		String[] names = play.split("");// names陣列存數入被分割的字串
		int names1[] = new int[names.length]; // 定義跟names陣列一樣大小的整數陣列
		int m = 0, j, n = 0, x = 0, h = 0;
		for (int i = 1; i < names.length; i++) {
			names1[i] = Integer.parseInt(names[i]);
		}
		/*
		 * for (int i=0; i<names1.length; i++) { System.out.print(names1[i]);
		 * }//顯示轉化數字是否正確
		 */
		// System.out.println("names1[0]="+names1[0]);
		// System.out.println("names1[8]="+names1[8]);
		// System.out.println("arr0[8]="+arr0[8]);
		for (j = 8; j >= 0; j--) {
			if (names1[j] == arr0[j]) {
				m = m + 1;
			} else {
				break;
			}
		}
		// System.out.println(m);
		for (j = 8; j >= 0; j--) {
			if (names1[j] == arr1[j]) {
				x = x + 1;
			} else {
				break;
			}
		}
		// System.out.println(x);
		for (j = 8; j >= 0; j--) {
			if (names1[j] == arr2[j]) {
				n = n + 1;
			} else {
				break;
			}
		}
		// System.out.println(n);
		if (m >= 3) {
			h = m;
		}
		if (x >= 3) {
			h = x;
		}
		if (n >= 3) {
			h = n;
		}
		switch (h) {
		case 3:
			System.out.println("200元");
			break;
		case 4:
			System.out.println("1000元");
			break;
		case 5:
			System.out.println("4000元");
			break;
		case 6:
			System.out.println("10000元");
			break;
		case 7:
			System.out.println("40000元");
			break;
		case 9:
			System.out.println("200000元");
			break;
		}
	}
}