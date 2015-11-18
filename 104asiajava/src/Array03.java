import java.util.Scanner;

public class Array03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j = 0;
		Scanner scn = new Scanner(System.in);
		float data[][] = new float[3][6];
		String name[] = new String[4];
		int lose = 0;
		for (i = 0; i < 3; i++) {
			System.out.print("請輸入第" + (i + 1) + "個同學的四個成績:");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = scn.nextFloat();
			data[i][4] = (data[i][0] + data[i][1] + data[i][2]  + data[i][3]);
			data[i][5] = ((data[i][0] + data[i][1] + data[i][2] + data[i][3]) / 4);
		}
		for (int w = 0; i < 3; i++) {
			for (int x = i + 1; x < 3; x++) {
				if (data[w][5] > data[j][5]) {
					float v =  data[w][5];
					data[w][5] = data[x][5];
					data[x][5] = v;
				}
			}
		}
		System.out.println("全班成績如下:");
		for (i = 0; i < 3; i++) {
			System.out.println(data[i][0] + " " + data[i][1]
					+ " " + data[i][2] + " " + data[i][3]);
			
		}
		for (i = 0; i < 3; i++) {
			for (j = i + 1; j < 3; j++) {
				if (data[i][3] < data[j][3]) {
					int v1 = (int) data[i][3];
					data[i][3] = data[j][3];
					data[j][3] = v1;
				}
			}
		}
		System.out.println("全班分數由高至低為:");
		for (i = 0; i < 3; i++) {
			System.out.println(data[i][5]);
		}
	}
}