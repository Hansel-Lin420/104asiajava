package �Ĥ@�Ǵ�;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�T���(�Ѥp��j):");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (a <= b && b <= c) {
			if (c * c == a * a + b * b ) {
				System.out.println("�������T����");
			} else {
				if (a * a + b * b < c * c ) {
					System.out.println("���w���T����");
				} else {
					if (a * a + b * b > c * c ) {
						System.out.println("���U���T����");
					} else {
						System.out.println("�L���T����");
					}
				}
			}
		} else {
			System.out.print("�ХѤp��j��J");
		}
	}
}
