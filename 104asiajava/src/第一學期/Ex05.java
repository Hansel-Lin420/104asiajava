package 第一學期;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randnum = new Random();
		randnum.setSeed(1723);
		int data[][] = new int[10][10];
		int i = 0;
		int j = 0;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				data[i][j] = randnum.nextInt(10);
			}
		}
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print(data[j][i] + "\t");
				if (j == 9) {
					System.out.print("\n");
				}
			}
		}
	}
}
