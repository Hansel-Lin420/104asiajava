import java.util.Scanner;


public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		gg(x);
	}
	public static void gg(int m){
		int y=0;
		if(m<-1){
			y=(int)(3*(Math.pow(m,2)));
		}else if(m>=-1&&m<=1){
			y=(int)Math.pow(m,3)+3*m-3;
		}else if(m>1){
			y=2*m+3;
		}
		System.out.println(y);
	}
}
