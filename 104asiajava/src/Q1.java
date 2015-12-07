import java.util.Scanner;


public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long a=scn.nextLong();
		decomp(a);
	}
	public static void decomp(long m){
		int n=0;
		long p=m;
		while(p>0){
			p/=10;
			n++;
		}
		long a[]=new long[n];
		long b=0;
		while(m>0){
			a[(int) b]=m%10;
			m/=10;
			b++;
		}
		for(int i=0;i<n;i++){
			System.out.print(a[(int) (n-i-1)]+" ");
		}
		System.out.println();
	}
	}