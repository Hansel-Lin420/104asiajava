import java.util.Scanner;

public class cargod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("��J�ɨ�.");
		float a = scn.nextFloat();
		System.out.print("��J����b��.");
		float b = scn.nextFloat();
		System.out.print("��J���L�ؤo.");
		float c = scn.nextFloat();
		if (a > 43 && b >= 130 && c == 12) {
			System.out.print("�R�F");
		} else {
			System.out.print("�K�F");
		}
	}
}
