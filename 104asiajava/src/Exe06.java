import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		gcd(x);
	}

	public static void gcd(int x) {
		int i;
		int y ;
		for ( i = 1; i < 10000; i++) {
			 y = (int) Math.pow(x, i);
			if (y > 10000) {
				break;
			}
			
		}System.out.println(i);

	}
}
