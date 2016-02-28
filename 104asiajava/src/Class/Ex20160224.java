package Class;


import java.util.*;
public class Ex20160224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Book[] b = new Book[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Please input Book's name, isbn, price, category, publisher, totalpages: ");
			b[i] = new Book(scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next());
		}
		System.out.print("name,isbn or category?");
		String str = scn.next();
		if (str.equals("name")) {
			String name = scn.next();
			int i = 0;

			while (i < 5) {
				if (b[i].getName().equals(name)) {
					b[i].showInfo();

				}
				i++;
			}
		}
		if (str.equals("isbn")) {
			String isbn = scn.next();
			int j = 0;

			while (j < 5) {
				if (b[j].getISBN().equals(isbn)) {
					b[j].showInfo();

				}
				j++;
			}
		}
		if (str.equals("category")) {
			String category = scn.next();
			int k = 0;

			while (k < 5) {
				if (b[k].getCategory().equals(category)) {
					b[k].showInfo();

				}
				k++;

			}

		}
	}
}
