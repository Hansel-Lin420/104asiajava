

public class Ex5 {
	public static void main(String[] args) {
		fun(0, 0, 0);
	}

	private static void fun(int a, int b, int c) {
		// TODO Auto-generated method stub
for(a = 1;a<=200;a++ ){
	for(b = 1;b<=200;b++ ){
		for(c = 1;c<=200;c++){
			if(a*a+b*b==c*c&&a<b){
				System.out.println(a+"\t"+b+"\t"+c);
			}
		}
	}
}
	}
}
