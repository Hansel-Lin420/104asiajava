package �Ĥ@�Ǵ�;
import java.util.*;
public class class_student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
Student[] students =new Student[5];

String id,name;
int v1,v2,v3;
for(int i=0;i<5;i++){
	id = scn.next();
	name = scn.next();
	v1 = scn.nextInt();
	v2 = scn.nextInt();
	v3 = scn.nextInt();
students[i]=new Student(id,name,v1,v2,v3);
	}
System.out.println("�Ǹ�\t�m�W\t��妨�Z\t�^�妨�Z\t�ƾǦ��Z\t�������Z");
System.out.println("==================================================");
int sumC = 0,sumE=0,sumM=0;
for(Student stnd:students){
	sumC+=stnd.getcScore();
	sumE+=stnd.geteScore();
	sumM+=stnd.getnScore();
	System.out.println(stnd.getInfo());
	
}System.out.println("==================================================");
System.out.println("\t�U�즨�Z:\t"+((float)sumC/5)+"\t"+((float)sumE/5)+"\t"+((float)sumM/5));
	}
}
