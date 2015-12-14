import java.util.*;
public class fun1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
System.out.print(fun(n));
	}

	private static  int fun(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int a =1;
		for(int i=0;i<n;i++){
			sum =sum +a*(a+1);
			a++;
		}
		return sum;
	}

}
