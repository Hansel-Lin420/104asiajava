import java.util.Scanner;

public class Matrix {
	public static void main(String args[]) {
		int x = 1;
		while (x > 0) {
			Scanner scn = new Scanner(System.in);
			int ai, aj, bi, bj;
			System.out.print("�п�J�x�}A����ơG");
			ai = scn.nextInt();
			System.out.print("�п�J�x�}A���C�ơG");
			aj = scn.nextInt();
			System.out.print("�п�J�x�}B����ơG");
			bi = scn.nextInt();
			if (aj != bi) {
				System.out.println("�x�}�L�k�����B��");
				continue;
			}
			System.out.print("�п�J�x�}B���C�ơG");
			bj = scn.nextInt();
			int[][] a = new int[ai][aj];
			int[][] b = new int[bi][bj];
			for (int i = 0; i < ai; i++) {
				for (int j = 0; j < aj; j++) {
					System.out.print("�п�J�x�}A��" + (i + 1) + "�檺��" + (j + 1)
							+ "�Ӥ���");
					a[i][j] = scn.nextInt();
				}
			}
			System.out.println("�x�}A�G");
			for (int i = 0; i < ai; i++) {
				for (int j = 0; j < aj; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			for (int i = 0; i < bi; i++) {
				for (int j = 0; j < bj; j++) {
					System.out.print("�п�J�x�}B��" + (i + 1) + "�檺��" + (j + 1)
							+ "�Ӥ���");
					b[i][j] = scn.nextInt();
				}
			}
			System.out.println("�x�}B�G");
			for (int i = 0; i < bi; i++) {
				for (int j = 0; j < bj; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println();
			}
				System.out.println("�B�⵲�G�O");	
				Arraymatrix m = new Arraymatrix();
				m.mulMatrix(a, b);
				m.display();
				break;
			}
		}

	private int[][] G;

	public void mulMatrix(int[][] a, int[][] b) {
		G = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					G[i][j] =G[i][j] + a[i][k]
							* b[k][j];
				}
			}
		}
	}

	public void X() {
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < G[0].length; j++) {
				System.out.printf("%8d", G[i][j]);
			}
			System.out.println("");
			System.exit(50);
		}
	}
}