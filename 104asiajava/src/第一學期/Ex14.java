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
		int a = 0, b = 1;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				b = b + a;
				System.out.print(b);
				System.out.print("\t");
				b++;
			}
			System.out.print("\n");
			a++;
			b = 1;
		}

	}
}
