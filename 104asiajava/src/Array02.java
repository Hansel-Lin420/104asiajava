import java.util.*;
public class Array02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
String str=scn.nextLine();
char[] w =str.toCharArray();
w[0]=(char)(w[0]+32);
int n = str.length();
for (int i = 0; i < n; i++) {
	for (int j = i + 1; j < n; j++) {
		if (w[i] > w[j]) {
			char v = w[i];
			w[i] = w[j];
			w[j] = v;
		}
	}
}for (int i = 0; i < n; i++) {
	System.out.print(w[i]);
}
	}

}
