import java.util.*;

public class Exe04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int cost = scn.nextInt();
		fun(cost);

	}

	private static void fun(int cost) {
		// TODO Auto-generated method stub
		int a, b, c, d, e, f;
		int cost2 = 1000 - cost;
		a = cost2 / 500;
		b = cost2 % 500 / 100;
		c = cost2 % 100 / 50;
		d = cost2 % 50 / 10;
		e = cost2 % 10 / 5;
		f = cost2 % 5 / 1;
		System.out.println(a + "��500 " + b + "��100 " + c + "��50 " + d + "��10 "
				+ e + "��5 " + f + "��1");
	}

}