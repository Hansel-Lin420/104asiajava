import java.util.Scanner;

public class drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner drink = new Scanner(System.in);
		System.out.println("�п�J�~�P:");
		String str = drink.next();
		System.out.println("�п�J�~�W:");
		String st = drink.next();
		System.out.println("�п�J����:");
		int a = drink.nextInt();
		if (str.equals("���Q�P") || a > 45) {
			System.out.println("���|�R");

		} else {
			if (st.equals("���") || st.equals("�@��") && a <= 45) {
				System.out.println("�|�R");
			}

		}

	}
}