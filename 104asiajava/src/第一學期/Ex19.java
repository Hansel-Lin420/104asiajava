package �Ĥ@�Ǵ�;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J:");
		char ch = scn.next().charAt(0);
		if (ch >= 97 && ch <= 122) {
			System.out.print("�p�g");
		} else {
			if (ch >= 65 && ch <= 90) {
				System.out.print("�j�g");
			} else {
					System.out.print("��L�r��");
				
			}
		}
	}
}
