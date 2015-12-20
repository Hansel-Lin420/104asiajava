import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
float n = scn.nextFloat();
System.out.println(fun(n));
	}

	private static float fun(float n) {
		// TODO Auto-generated method stub
		if(n==0){
			return 0;
		}else
		return 1/((2*n-1)*(2*n))+fun(n-1);
	}

}
