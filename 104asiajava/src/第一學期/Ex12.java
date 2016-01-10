package 第一學期;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int chinese = scn.nextInt();
		int english = scn.nextInt();
		int math = scn.nextInt();
		System.out.println((chinese + english + math));
		System.out.println(((chinese + english + math)/3));
	}

}
