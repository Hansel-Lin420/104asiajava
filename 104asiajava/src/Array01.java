import java.util.*;

public class Array01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int data[] = new int[n];
		if (m == 1) {
			for (int a = 0; a < n; a++) {
				data[a] = scn.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (data[i] > data[j]) {
						int v = data[i];
						data[i] = data[j];
						data[j] = v;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				System.out.println(data[i]);
			}
		}
		if (m == 2) {
			for (int a = 0; a < n; a++) {
				data[a] = scn.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (data[i] < data[j]) {
						int v = data[i];
						data[i] = data[j];
						data[j] = v;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				System.out.println(data[i]);
			}
		}
	}
}