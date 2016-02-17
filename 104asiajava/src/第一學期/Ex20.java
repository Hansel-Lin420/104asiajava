package 第一學期;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test;
		System.out.print("輸入一串數字:");
		Scanner scanner = new Scanner(System.in);
		test = scanner.next();
		int i=Integer.parseInt(test);
		System.out.print("decomp("+test+"):"+decomp(test));
		}
		public static String decomp(String m)
		{
		String[] names=m.split("");
		String x="";
		for(int i=0;i<m.length();i++)
		{
		x=x+names[i];
		x=x+" ";
		}
		m=x;
		return m;
		}
		}
