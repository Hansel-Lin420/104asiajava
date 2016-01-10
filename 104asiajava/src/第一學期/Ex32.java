package 第一學期;
import java.util.Random;
public class Ex32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int data[][] = new int[5][7];
		int i = 0;
		int j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 7; j++) {
				data[i][j] = rnd.nextInt(100);
				 System.out.print(data[i][j] + "\t");
				 if (j == 6) {
				 System.out.print("\n");
				 }

			}
		}
		System.out.print("\n");
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(data[j][i] + "\t");
				if (j == 4) {
					System.out.print("\n");
				}
			}
		}
	}

}
