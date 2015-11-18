import java.util.*;

public class aa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("要輸入幾個數:");
		int i=0,j=0,n=scn.nextInt();
		int data[] = new int[n];
		boolean flag=false;
		while(i<n){
			System.out.println("請輸入數字("+(i+1)+"):");
			data[i]=scn.nextInt();
			flag=false;
			for(j =0;j<i;j++){
				if(data[i]==data[j]){
					flag=true;
					
				}
			}
			if(flag==false){
				i++;
			}
		}
		
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if (data[i] > data[j]) {
					int v1=data[i];
					data[i]=data[j];
					data[j]=v1;
				}
			}
				}
			for(i=0;i<n;i++){
				System.out.println(data[i]);
		}
}
}