package HW;

import java.util.*;

public class HW01 {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}

	private static void fun() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] prize1 = { 0, 1, 2, 7, 2, 6, 3, 6 };
		int[] prize2 = { 3, 9, 4, 1, 2, 2, 0, 1 };
		int[] prize3 = { 9, 4, 5, 8, 6, 3, 5, 6 };
		System.out.print("發票號碼:");
		String name = scn.next();
		char ch[] = name.toCharArray();
		int numbers[] = new int[ch.length];
		int j, a = 0, b = 0, c = 0, yn = 0;
		for (int i = 1; i < ch.length; i++) {
			numbers[i] = Integer.valueOf(ch[i] - '0');
		}
		for (j = 7; j >= 0; j--) {
			if (numbers[j] == prize1[j]) {
				a = a + 1;
			} else {
				break;
			}
		}
		for (j = 7; j >= 0; j--) {
			if (numbers[j] == prize2[j]) {
				b = b + 1;
			} else {
				break;
			}
		}
		for (j = 7; j >= 0; j--) {
			if (numbers[j] == prize3[j]) {
				c = c + 1;
			} else {
				break;
			}
		}
		if (a >= 3) {
			yn = a;
		}
		if (b >= 3) {
			yn = b;
		}
		if (c >= 3) {
			yn = c;
		}

		switch (yn) {
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
		case 8:
			System.out.println("200000元");
			break;
		}
	}

}