package Class;

import java.util.*;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Game[] g = new Game[10];
		System.out.println("How many games you want to build?");
		int build = scn.nextInt();
		int i;
		for (i = 0; i < build; i++) {
			System.out.println("Please input Game" + "(" + (i + 1) + ")"
					+ "'s name, type, close test date, open test date, status, agent, company, charge mode, classification, memo: ");
			g[i] = new Game(scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next(),
					scn.next(), scn.next(), scn.next());
		}
		System.out.println("Add game or Search a game?(add/search)");
		String a = scn.next();
		if (a.equals("add")) {
			System.out.println("How many games you want to add?");
			int add = scn.nextInt();
			for (i=i; i < (build+add); i++) {
				System.out.println("Please input Game" + "(" + (i + 1) + ")"
						+ "'s name, type, close test date, open test date, status, agent, company, charge mode, classification, memo: ");
				g[i] = new Game(scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next(), scn.next(),
						scn.next(), scn.next(), scn.next());
			}
		}
		if (a.equals("search"))
			System.out.print("name,type,status,agent,company,chargemode or classification?");
		String str = scn.next();
		if (str.equals("name")) {
			System.out.print("input name:");
			String name = scn.next();
			int j = 0;

			while (j < build) {
				if (g[j].getName().equals(name)) {
					g[j].showInfo();

				}
				j++;
			}
		}
		if (str.equals("type")) {
			System.out.print("input type:");
			String type = scn.next();
			int j = 0;

			while (j < build) {
				if (g[j].getType().equals(type)) {
					g[j].showInfo();

				}
				j++;
			}
		}
		if (str.equals("status")) {
			System.out.print("input status:");
			String status = scn.next();
			int j = 0;

			while (j < build) {
				if (g[j].getStatus().equals(status)) {
					g[j].showInfo();

				}
				j++;
			}
		}
		if (str.equals("agent")) {
			System.out.print("input agent:");
			String agent = scn.next();
			int j = 0;

			while (j < build) {
				if (g[j].getAgent().equals(agent)) {
					g[j].showInfo();

				}
				j++;
			}
		}
		if (str.equals("company")) {
			System.out.print("input company:");
			String company = scn.next();
			int j = 0;

			while (j < build) {
				if (g[j].getCompany().equals(company)) {
					g[j].showInfo();

				}
				j++;
			}
		}
		if (str.equals("chargemode")) {
			System.out.print("input chargemode:");
			String chargemode = scn.next();
			int j = 0;

			while (j < build) {
				if (g[j].getChargeMode().equals(chargemode)) {
					g[j].showInfo();

				}
				j++;
			}
		}
		if (str.equals("classification")) {
			System.out.print("input classification:");
			String classification = scn.next();
			int j = 0;

			while (j < build) {
				if (g[j].getClassification().equals(classification)) {
					g[j].showInfo();

				}
				j++;
			}
		}

	}

}