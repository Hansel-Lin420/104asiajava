import java.util.Scanner;

public class ASCII_Code2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a word:");
		String str = scn.next();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122) {
				System.out.print("�p�g");
				break;
			} else {
				if (ch[i] >= 65 && ch[i] <= 90) {
					System.out.print("�j�g");
					break;
				} else {
					if (ch[i] != 65 && ch[i] != 90) {
						System.out.print("��L�r��");
						break;
					}
				}
			}

		}
	}
}
