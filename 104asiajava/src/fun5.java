import java.util.Scanner;

public class fun5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.print(fun(n));
	}

	public static int fun(int m) {
		if(m==0){
			return 0;
		}
			return (int)Math.pow(2, m)+fun(m-1);
		}
	}