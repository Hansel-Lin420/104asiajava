import java.util.Scanner;

public class Array2D2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("���X�Ӿǥ�:");
		int n = scn.nextInt();
		float data[][] = new float[n][4];
		String name[] = new String[4];
		int lose = 0;
		for (i = 0; i < n; i++) {
			System.out.print("�п�J��" + (i + 1) + "��P�Ǫ��W�l:");
			name[i] = scn.next();
			System.out.println("�п�J3�즨�Z:");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = ((data[i][0] + data[i][1] + data[i][2]) / 3);
		}
		System.out.println("���Z���Z�p�U:");
		for (i = 0; i < n; i++) {
			System.out.println(name[i] + " " + data[i][0] + " " + data[i][1]
					+ " " + data[i][2] + " " + data[i][3]);
			if (data[i][3] < 60) {
				lose = lose + 1;
			}
		}
		System.out.println("���ή�H�Ʀp�U:" + lose + "�H");
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (data[i][3] < data[j][3]) {
					int v1 = (int) data[i][3];
					data[i][3] = data[j][3];
					data[j][3] = v1;
				}
			}
		}
		System.out.println("���Z���ƥѰ��ܧC��:");
		for (i = 0; i < n; i++) {
			System.out.println(data[i][3]);
		}
		System.out.println("�̰����Ƭ�:");
		System.out.println(data[0][3]);
		System.out.println("�̧C���Ƭ�:");
		System.out.println(data[n - 1][3]);
	}
}