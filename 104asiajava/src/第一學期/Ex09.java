package �Ĥ@�Ǵ�;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		float a = scn.nextFloat();
		if (str.equals("1")) {
			float b = (float)((a - 170) * 0.6 + 62);
			System.out.print("�A���z�Q�魫�O:" + b);
		} else {
			if (str.equals("2")) {
				float b = (float)((a - 158) * 0.5 + 52);
				System.out.print("�A���z�Q�魫�O:" + b);
			}
		}
	}

}
