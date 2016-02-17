import java.util.*;

public class score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int data[][] = new int[5][6];
		int v1[][] = new int[1][6];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				data[i][j] = ran.nextInt(101);
			}

		}
		for (int i = 0; i < 5; i++) {
			int sum =0;
			for (int j = 0; j < 5; j++) {
				 sum = sum + data[i][j];
			}
			data[i][5] = sum / 5;
		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 6; j++) {
				for(int k = i-1;k>=0;k-- )
				if (data[i][5] > data[k][5]) {
					 v1[0][j] = data[i][j];
					data[i][j] = data[k][j];
					data[k][j] = v1[0][j];
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

