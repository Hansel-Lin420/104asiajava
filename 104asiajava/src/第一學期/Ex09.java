package 第一學期;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		float a = scn.nextFloat();
		if (str.equals("1")) {
			float b = (float)((a - 170) * 0.6 + 62);
			System.out.print("你的理想體重是:" + b);
		} else {
			if (str.equals("2")) {
				float b = (float)((a - 158) * 0.5 + 52);
				System.out.print("你的理想體重是:" + b);
			}
		}
	}

}
