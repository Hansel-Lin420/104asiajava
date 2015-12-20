import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));
	}

	private static int fun(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (int) Math.pow(2, i);
		}
		return sum;
	}

}
