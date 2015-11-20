package 第一學期;

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
					System.out.println("請輸入成績:");
					data[i] = scn.nextFloat();
					sum+=data[i];
				}
				System.out.println("平均:" + sum/5 + "分");
				for (i = 0; i < 5; i++) {
					if (data[i] < 60) {
						lose = lose + 1;
					}
				}
				System.out.println("不及格人數如下:" + lose + "人");

				System.out.println("全班分數由高至低為:");
				for (i = 0; i < 5; i++) {
					if (data[i]<min) {
						min=data[i];
					} if(data[i]>max) {
						max=data[i];
					}
				}
				System.out.println("最高分數為:");
				System.out.println(max);
				System.out.println("最低分數為:");
				System.out.println(min);
			}
		}
