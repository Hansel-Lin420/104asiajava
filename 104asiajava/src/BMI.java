import java.util.Scanner;
public class BMI {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bmi = new Scanner(System.in);
		System.out.println("�п�J���ʧO:");
		String str = bmi.next();
		System.out.println("�п�J����:");
		double a= bmi.nextFloat();
		if(str.equals("�k")){				
			double b = (a-170)*0.6+62;
			System.out.println("�A���z�Q�魫�O:"+b);			
}else{
	if(str.equals("�k")){				
		double b = (a-158)*0.5+52;
		System.out.println("�A���z�Q�魫�O:"+b);
}else{
	System.out.println("�Ф��n�ÿ�J!!!");
	
}
	}
}
}