package 第一學期;
import java.util.*;
public class Ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rnd = new Random();
Scanner scn = new Scanner(System.in);
int a = rnd.nextInt(100)+1;
while(true){
	int b = scn.nextInt();
	if(a==b){
		System.out.println("答對了");
	 break;
	}
	if(a>b){
		System.out.println("太小");
	}if(a<b){
		System.out.println("太大");
	}
}
	}

}
