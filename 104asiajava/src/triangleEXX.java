import java.util.Scanner;
public class triangleEXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			System.out.println("��J�̪����");
			float c = scn.nextFloat();
			System.out.println("��Ja���");
			float a = scn.nextFloat();
			System.out.println("��Jb���");
			float b = scn.nextFloat();
			if(c*c==a*a+b*b&&(a<=b&&b<=c)){
				System.out.println("�������T����");
			}else{
				if(a*a+b*b < c*c&&(a<=b&&b<=c)){
					System.out.println("���w���T����");
				}else{
					if(a*a+b*b > c*c&&(a<=b&&b<=c)){
						System.out.println("���U���T����");
					}else{
						System.out.println("�L���T����");
					}
				}
	}
	}
}