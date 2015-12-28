package 第一學期;

import java.util.*;

public class Ex90 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println(myrand(n, m));
	}

	private static float myrand(int n, int m) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int i = 0;
		float sum = 0;
		while (i < n) {
			float w = rnd.nextInt(m);
			sum += w;
			i++;
		}
		return sum/n;

	}

}