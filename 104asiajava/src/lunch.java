
public class lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resturant[] = { "�͹Ͷ�", "������", "�ݮa", "����", "�W���a",
							   "���","�����","���a","7-11","�D��","�o�@�����\",
							   "�Ө�","�|��","���ӫ�" };
		System.out.println("���ѦY����?");
		int a = (int) (Math.random() * resturant.length);
		System.out.println((a+1)+"."+resturant[a]);
	}

}