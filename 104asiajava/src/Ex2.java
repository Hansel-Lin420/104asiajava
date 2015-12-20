import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
String str = scn.nextLine();
fun(str);
	}

	private static void fun(String str) {
		// TODO Auto-generated method stub
		char[] ch = str.toCharArray();
		int sum = 0;
		for(int i =0; i<ch.length;i++){
			if(ch[i]-'0'<=9&&ch[i]-'0'>=0){
				sum+=ch[i]-'0';
			}
		}System.out.println(sum);
	}

}
