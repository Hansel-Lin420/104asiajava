import java.util.Scanner;
public class while_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
for(int i=0;i>=0;i++){
	System.out.println("�п�J�褸�~");
	int a=scn.nextInt();
	if((a%10==4)||(a%400==0)){
	System.out.println("�O�|�~");
	break;
	}else{
		if(a>100&&a%100==0){
		System.out.println("���O�|�~");		
	}else{
		System.out.println("���O�|�~");	
	}
		
}
}
}	}