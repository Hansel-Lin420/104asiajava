package �Ĥ@�Ǵ�;

import java.util.*;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�T���(�Ѥp��j):");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (a <= b && b <= c) {
			if (a + b >= c && a + c >= b && b + c >= a) {
				System.out.print("�O�X�k���");
			} else {
				System.out.print("�D�X�k���");
			}

		}else{
			System.out.print("�ХѤp��j��J");
		}
	}
}