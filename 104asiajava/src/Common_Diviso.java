import java.util.Scanner;

public class Common_Diviso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�п�J�Ĥ@�Ӿ�ơG");
		int m = scan.nextInt();
		System.out.print("�п�J�ĤG�Ӿ�ơG");
		int n = scan.nextInt();

		System.out.println(Common_Diviso(m, n));
	}

	public static int Common_Diviso(int m, int n) {
		if (m % n == 0) {

		} else {
			return Common_Diviso(n, m % n);
		}
		return n;
	}
}