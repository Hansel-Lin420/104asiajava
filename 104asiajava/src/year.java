import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("��J�褸�~");
		int year = scn.nextInt();
		if ((year % 10 == 4) || (year % 400 == 0)) {
			System.out.println("�O�|�~");
		} else {
			if (year > 100 && year % 100 == 0) {
				System.out.println("���O�|�~");
			} else {
				System.out.println("���O�|�~");
			}

		}
	}
}