import java.util.Scanner;

public class receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a[] = new int[3];
		System.out.println("�o�̦���:");
		System.out.println("�c���l   100.85��");
		System.out.println("�p����    108.85��");
		System.out.println("�}�]�C     98.25��");
		System.out.println("�R�h�֭Ӵc���l?");
		a[0] = scn.nextInt();
		System.out.println("�R�h�֭ӹp����?");
		a[1] = scn.nextInt();
		System.out.println("�R�h�֭ӯ}�]�C?");
		a[2] = scn.nextInt();
		Weapon �c���l = new Weapon(100.85, 0);
		Weapon �p���� = new Weapon(108.85, 0);
		Weapon �}�]�C = new Weapon(98.25, 0);
		System.out.println("	      " + "�o��(�Ȭw��u��)" + "					");
		System.out.println("�x�������p�Ϭh�׸�500��");
		System.out.println("�q��:04-23323456 #6101");
		System.out.println("�ǯu:04-23323876");
		System.out.println("==================================");
		System.out.println("�Z���W�١@�@�@����@�@�@�@�@�ƶq�@�@�@�@�@�p�p");
		System.out.println("----------------------------------");
		while (a[0] > 0) {
			System.out.println("�c���l�@�@�@" + �c���l.getprice() + "	  " + a[0] + "	  " + �c���l.getprice() * a[0]);
			break;
		}
		while (a[1] > 0) {
			System.out.println("�p����@�@�@" + �p����.getprice() + "	  " + a[1] + "	  " + �p����.getprice() * a[1]);
			break;
		}
		while (a[2] > 0) {
			System.out.println("�}�]�C�@�@�@" + �}�]�C.getprice() + "	  " + a[2] + "	  " + �}�]�C.getprice() * a[2]);
			break;
		}
		System.out.println("==================================");
		System.out.println("�X�p" + (�c���l.getprice() * a[0] + �p����.getprice() * a[1] + �}�]�C.getprice() * a[2]));
		System.out.println("�ݭn�d�߰ӫ~�Z����T��?(��JYorN)");
		String str = scn.next();
		while (true) {
			if (str.equals("Y")) {
				System.out.println("�п�J�Z���W��:");
				String st = scn.next();
				if (st.equals("�c���l")) {
					System.out.println("����:100.85��");
					System.out.println("�����O+1000");
					System.out.println("��c���ˮ`+20%");
					System.out.println("�ٻݭn�d�߰ӫ~�Z����T��?(��JYorN)");
					String aa = scn.next();
					if (aa.equals("N")) {
						System.out.println("���´f�U!!!");
						break;
					}
				} else {
					if (st.equals("�p����")) {
						System.out.println("����:108.85��");
						System.out.println("�����t��+150%");
						System.out.println("�C�����T�����[�ۨ������O500%���ˮ`");
						System.out.println("�ٻݭn�d�߰ӫ~�Z����T��?(��JYorN)");
						String bb = scn.next();
						if (bb.equals("N")) {
							System.out.println("���´f�U!!!");
							break;
						}
					} else {
						if (st.equals("�}�]�C")) {
							System.out.println("����:98.25��");
							System.out.println("�L���ĤH�����m30%");
							System.out.println("�ٻݭn�d�߰ӫ~�Z����T��?(��JYorN)");
							String cc = scn.next();
							if (cc.equals("N")) {
								System.out.println("���´f�U!!!");
								break;
							}
						}
					}
				}
			} else {
				if (str.equals("N")) {
					System.out.println("���´f�U!!!");
					break;
				}
			}
		}
	}
}

class Weapon {
	private float price;

	public Weapon(double d, int q) {
		price = (float) d;
	}

	public void setprice(double p) {
		price = (float) p;
	}

	public float getprice() {
		return price;

	}
}