import java.util.Scanner;

public class Array2D1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float data[][] = new float[4][4];
		String name[] = new String[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("�п�J��" + (i + 1) + "��P�Ǫ��W�l:");
			name[i] = scn.next();
			System.out.println("�п�J3�즨�Z:");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = ((data[i][0] + data[i][1] + data[i][2])/3);
		}
		System.out.println("���Z���Z�p�U:");
		for (int i = 0; i < 4; i++) {
			System.out.println(name[i] + " " + data[i][0] + " " + data[i][1]
					+ " " + data[i][2] + " " + data[i][3]);
		}
	}
}

