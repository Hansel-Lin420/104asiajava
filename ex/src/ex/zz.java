package ex;
import java.util.Scanner;
public class zz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in); 
		System.out.println("請輸入一數值："); 
		int i=scanner.nextInt(); 
		System.out.print(i+" 以下的質數有：\n"); 
		for(int k=2;k<=i;k++) 
		{ 
		boolean flag=true; 
		for(int j=2;j<k;j++) 
		{ 
		if(k%j==0) 
		{ 
			flag=false; 
		break; 
		} 
		} 
		if(flag) 
		{ 
		System.out.print(k+" "); 
		} 
		} 
		} 
		
	}
