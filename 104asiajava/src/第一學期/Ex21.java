package �Ĥ@�Ǵ�;
import java.util.Random;
import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
Random rnd = new Random();
System.out.println("�вq1~5�䤤�@�ӼƦr:");
int a = scn.nextInt();
int b = (rnd.nextInt(5)+1);
if(a==b){
	System.out.println("�AĹ�F!!!");
	System.out.println("���׬O:"+b);
}else{System.out.println("�A��F!!!");
System.out.println("���׬O:"+b);
	
}
	}

}
