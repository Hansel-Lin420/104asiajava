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
		ArrayList<Course> course = new ArrayList<Course>();
		while (true) {
			System.out.println("1)Add, 2)delete, 3)Show info, 4)stop:");

			int op = scn.nextInt();
			switch (op) {
			case 1:
				System.out.print("1)Teacher, 2)Course:");
				String str = scn.next();
				if (str.equals("1")) {

					System.out.println("name ,id ,dept:");
					teacher.add(new Teacher(scn.next(), scn.next(), scn.next()));
					break;
				}
				if (str.equals("2")) {
					System.out.println("course name ,course id ,teacher:");
					course.add(new Course(scn.next(), scn.next(), scn.next()));
					break;
				}
			case 2:

				boolean flag = true;
				boolean flag1 = true;

				int j = 0;
				int k = 0;
				while (j < teacher.size() && flag) {
					System.out.println("name:");
					String y = scn.next();
					if (teacher.get(j).getName().equals(y)) {
						System.out.println("Teacher " + teacher.get(j).getName() + " has been delete");
						teacher.remove(j);
						flag = false;
					} else {
						j++;
					}
				}
				while (k < course.size() && flag1) {
					System.out.println("course name:");
					String x = scn.next();
					if (course.get(k).getName().equals(x)) {
						System.out.println("Course " + course.get(k).getName() + " has been delete");
						course.remove(k);
						flag1 = false;
					} else {
						k++;
					}
				}
				break;
			case 4:
				System.out.println("Thank you, see u next time. Bye bye!!");
				System.exit(0);
			case 3:
				if (teacher.size() > 0) {
					if (teacher.size() > 0) {
						for (Teacher i : teacher) {
							i.showAll();
						}
					}
					if (teacher.size() == 0) {
						System.out.println("no info");
					}
				}
				if (course.size() > 0) {
					if (course.size() > 0) {
						for (Course i : course) {
							i.getCourse();
						}
					}
				}
				if (teacher.size() == 0) {
					System.out.println("no info");
				}

			}

		}
	}
}
