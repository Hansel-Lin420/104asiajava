package �Ĥ@�Ǵ�;

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int i, j = 0;
				Scanner scn = new Scanner(System.in);
				float data[] = new float[5];
				int lose = 0;
				float sum=0,max=0,min=999;
				for (i = 0; i < 5; i++) {
					System.out.println("�п�J���Z:");
					data[i] = scn.nextFloat();
					sum+=data[i];
				}
				System.out.println("����:" + sum/5 + "��");
				for (i = 0; i < 5; i++) {
					if (data[i] < 60) {
						lose = lose + 1;
					}
				}
				System.out.println("���ή�H�Ʀp�U:" + lose + "�H");

				System.out.println("���Z���ƥѰ��ܧC��:");
				for (i = 0; i < 5; i++) {
					if (data[i]<min) {
						min=data[i];
					} if(data[i]>max) {
						max=data[i];
					}
				}
				System.out.println("�̰����Ƭ�:");
				System.out.println(max);
				System.out.println("�̧C���Ƭ�:");
				System.out.println(min);
			}
		}
