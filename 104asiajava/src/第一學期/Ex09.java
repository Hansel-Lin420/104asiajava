package �Ĥ@�Ǵ�;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���ʧO:");
		String str = scn.next();
		System.out.print("�п�J����:");
		double a = scn.nextFloat();
		if (str.equals("�k")) {
			double b = (a - 170) * 0.6 + 62;
			System.out.print("�A���z�Q�魫�O:" + b);
		} else {
			if (str.equals("�k")) {
				double b = (a - 158) * 0.5 + 52;
				System.out.print("�A���z�Q�魫�O:" + b);
			}
		}
	}

}
