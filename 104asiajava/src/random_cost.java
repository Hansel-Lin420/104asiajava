import java.util.Scanner;
public class random_cost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("���~����:");
		int a= scn.nextInt();
		System.out.print("��I���B:");
		int b =  scn.nextInt();
		System.out.println("���z"+b+"��");
		int n= b- a;
int n1[]= {500,100,50,10,5,1};
int n2[]= new int[6];
for (int i =0;i<n1.length;i++){
	n2[i]=n/n1[i];
	n=n%n1[i];
	if(n2[i]>0){
		System.out.println("��z"+n2[i]+"��"+n1[i]+"��");
	}else{
		System.out.println("�L�ݧ�s!");
		break;
	}
}
	}

}

