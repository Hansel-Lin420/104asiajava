import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		System.out.print(lcm(x,y,z));
	}
	public static int gcd(int x,int y){
		if(y==0){
			return x;
		}
		else{
			return gcd(y,x%y);
			}
		}
	public static int lcm(int x,int y,int z){
		int v1=x*y/gcd(x,y);
		return v1*z/gcd(v1,z);
	}
}
