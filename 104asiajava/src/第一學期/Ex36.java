package 第一學期;
import java.util.*;
public class Ex36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int  sum = 1;
		int  a = scn.nextInt();
		int i = 1;
		while(i<=a){
			sum=sum*i;
					i++;
		}System.out.print(sum);
	}

}
