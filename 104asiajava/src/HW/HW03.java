package HW;

import java.util.*;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		String str = scn.next();
		char ch[] = str.toCharArray();
		int numbers[] = new int[ch.length];
		int cpu[] = new int[4];
		int a = 0;
		for (int i = 0; i < 4; i++) {
			cpu[i] = rnd.nextInt(10);
			if(cpu[0]==0){
				cpu[0]= rnd.nextInt(10)+1;
			}
			numbers[i] = Integer.valueOf(ch[i] - '0');
			if(numbers[i]==cpu[i]){
				a++;
			}
		}
		System.out.print(a);
	}
}