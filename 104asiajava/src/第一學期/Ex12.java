package �Ĥ@�Ǵ�;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J��妨�Z:");
		int chinese = scn.nextInt();
		System.out.print("�п�J�^�妨�Z:");
		int english = scn.nextInt();
		System.out.print("�п�J�ƾǦ��Z:");
		int math = scn.nextInt();
		System.out.println("�`���Z:" + (chinese + english + math));
		System.out.println("�������Z:" + ((chinese + english + math)/3));
	}

}
