package 第一學期;

import java.util.Scanner;

public class Ex16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (a % 2 == 1) {
			System.out.println("Odd");
		}
		if (a % 2 == 0) {
			System.out.println("Even");
		}if (b % 2 == 1) {
			System.out.println("Odd");
		}
		if (b % 2 == 0) {
			System.out.println("Even");
		}if (c % 2 == 1) {
			System.out.println("Odd");
		}
		if (c % 2 == 0) {
			System.out.println("Even");
		}
	}

}
