import java.util.Scanner;


public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int arr[]={8,2,3,4,5,7};
		square(arr);
	}
	public static void square(int j[]){
		int k[]=new int[6];
		for(int i=0;i<6;i++){
			k[i]=(int) Math.pow(j[i],2);
			System.out.print(k[i]+" ");
		}
			
	}

}
