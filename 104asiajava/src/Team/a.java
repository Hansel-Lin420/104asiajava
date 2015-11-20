package Team;

public class a {
	public static void main(String[] args) {
		int data[][]=new int[3][3];
		int k=1;
		for(int i =0;i<3;i++){
			if(i%2==0){
				for(int j =0;j<3;j++){
					data[i][j]=k;
					k++;
				}
				
			}else{
				for(int j =3-1;j>=0;j--){
					data[i][j]=k;
					k++;
					
				}
			}
		}for (int i = 0; i < 3; i++) {
			for (int j = 0; j <=  3-i-1; j++) {
				System.out.print(data[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
