import java.util.Scanner;

public class triangleEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("��J�̪����");
		float c = scn.nextFloat();
		System.out.println("��Ja���");
		float a = scn.nextFloat();
		System.out.println("��Jb���");
		float b = scn.nextFloat();

		if (a <= b && b <= c) {
			System.out.println("�O�X�k���");
		} else {
			System.out.println("�D�X�k���");
		}

	}

}
