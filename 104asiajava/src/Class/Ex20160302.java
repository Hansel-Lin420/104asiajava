package Class;

import java.util.*;

public class Ex20160302 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		while (true) {
			System.out.println("1)Add, 2)delete,  3)Show info, 4)stop:");
			int op = scn.nextInt();
			switch (op) {
			case 1:
				System.out.println("input teacher's info:");
				teacher.add(new Teacher(scn.next(), scn.next(), scn.next(), scn
						.next(), scn.next(), scn.next(), scn.next()));
				break;
			case 2:
				System.out.println("name:");
				boolean flag = true;
				String y =scn.next();
				int j =0;
				while(j<teacher.size()&&flag){
					if(teacher.get(j).getName().equals(y)){
						System.out.println("Teacher "+teacher.get(j).getName()+" has been delete");
						teacher.remove(j);
						flag = false;
					}else{
						j++;
					}
				}break;
				case 3:
					if (teacher.size() > 0) {
				if (teacher.size() > 0) {
					for (Teacher i : teacher) {
						i.showAll();
					}
				}
				}
				
			}

		}
	}
}
