package �Ĥ@�Ǵ�;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�e:");
		int w = scn.nextInt();
		System.out.print("�п�J��:");
		int h = scn.nextInt();
		F(w, h);
	}

	private static void F(int w, int h) {
		// TODO Auto-generated method stub
		int number_h = 1;
		for (int i = h; i > 0; i--) {
			for (int j = w; j > 0; j--) {
				number_h++;
				System.out.print(number_h+"\t");
			}
			System.out.println("");
		}
	}
}
