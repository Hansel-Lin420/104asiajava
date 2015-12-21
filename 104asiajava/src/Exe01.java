import java.util.Scanner;
public class Exe01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
fun(n);
	}

	private static void fun(int n) {
		// TODO Auto-generated method stub
		int x = n/2,count = 0;
		System.out.println("1");
		for(int i = 2;i<=x;i++){
			if(n%i==0){
				System.out.println(i);
				count ++;
			}
		}
		System.out.println(n);
		if(count ==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
