package 第一學期;
import java.util.*;
public class Ex49 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n=scn.nextLong();
		long b =10;
		long i =0;
		while(true){
			long w=n/b;
			b=b*10;
			i++;
			if(w==0){
				break;
			}
		}
		System.out.print(i);
	}
}
