import java.util.Scanner;

public class trapezoid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner g = new Scanner(System.in);
		System.out.print("�п�J�W���C");
		float c = g.nextFloat();
		System.out.print("�п�J�U���C");
		float d = g.nextFloat();
		System.out.print("�п�J���C");
		float p = g.nextFloat();
		float x = (c + d) * p / 2;
		System.out.println("��έ��n��" + x);
	}

}
