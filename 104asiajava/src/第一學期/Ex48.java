package 第一學期;

import java.util.*;

public class Ex48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt();
		String i = ""+w;
		char[] c = i.toCharArray();
		for (int j = i.length() - 1; j >= 0; j--) {
			System.out.print(c[j]);
		}
	}
}
