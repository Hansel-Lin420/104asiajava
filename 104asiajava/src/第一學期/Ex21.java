package 第一學期;

import java.util.Random;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random randnum = new Random();
		int s = scn.nextInt();
		randnum.setSeed(s);
		int a = scn.nextInt();
		int w = scn.nextInt();
		
		int q = scn.nextInt();
		int b = (randnum.nextInt(5) + 1);
		if (a == b) {
			System.out.println("Ture");
			System.out.println(b);
		} else {
			System.out.println("Flase");
			System.out.println(b);
			randnum.setSeed(w);
			int f = (randnum.nextInt(5) + 1);
			if (q == f) {
				System.out.println("Ture");
				System.out.println(f);
			} else {
				System.out.println("Flase");
				System.out.println(f);

			}
		}
	}
}