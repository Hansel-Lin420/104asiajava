package 第一學期;

import java.util.Random;
import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		int a = rnd.nextInt(9000)+1000;
		int d =0;
		String str= ""+a;
		char [] ch = str.toCharArray();
		while(true){
			int c = scn.nextInt();
			String str1= ""+c;
			char [] ch1 = str1.toCharArray();
			for(int i =0;i<4;i++){
				if(ch[i]==ch1[i]){
					d++;				
				}
				
			}System.out.println("你猜中了"+d+"個位數");
			
		}
	}

}
