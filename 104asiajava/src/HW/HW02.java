package HW;

import java.util.Random;
public class HW02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int a, b, c, d;
		int cost = rnd.nextInt((1000) + 1);
		a = cost / 1000;
		b = cost % 1000 / 100;
		c = cost % 100 / 10;
		d = cost % 10 / 1;
		System.out.println(a + "¥a" + b + "¨Õ" + c + "¬B" + d + "¤¸");
	}

}
