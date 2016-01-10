package 第一學期;

import java.util.Scanner;

public class Ex13 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		char c = scn.next().charAt(0);
		int n = scn.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = n; j > 0; j--) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}