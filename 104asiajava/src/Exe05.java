import java.util.Scanner;

public class Exe05 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		fun(n);
	}

	private static void fun(int n) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= n; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}