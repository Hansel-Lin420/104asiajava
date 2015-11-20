package Team;

public class A04 {
	public static void main(String[] args) {
		int data[][]=new int[5][5];
		int k=1;
		for(int i =0;i<5;i++){
			if(i%2==0){
				for(int j =0;j<5;j++){
					data[i][j]=k;
					k++;
				}
				
			}else{
				for(int j =5-1;j>=0;j--){
					data[i][j]=k;
					k++;
					
				}
			}
		}for(int i=0;i<5;i++){
			for(int j =0;j<5;j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
