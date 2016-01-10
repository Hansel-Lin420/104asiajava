package 第一學期;
import java.util.*;
public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char[] c = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}

}
