import java.util.Scanner;
public class fun2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
float n = scn.nextFloat();
System.out.print(fun(n));
	}

	private static float fun(float n) {
		// TODO Auto-generated method stub
		float sum=0;
		float a =1;
		for(int i=0;i<n ;i++){
			sum =sum +1/((a*2-1)*(2*a));
			a++;
		}
		return sum;
	}

}
